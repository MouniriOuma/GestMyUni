package com.uni.dream.singletonConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/MyUni";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private final Connection connection;

    public static SingletonConnector connectionInstance;

    private SingletonConnector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static synchronized SingletonConnector getInstance(){
        if(connectionInstance == null)
        {
            connectionInstance = new SingletonConnector();
        }
        return connectionInstance;
    }
    public Connection getConnection() throws SQLException {
        return this.connection;
    }
    public void closeConnection() {
        try{
            if(this.connection !=null && !this.connection.isClosed()) {
                this.connection.close();
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }


}



