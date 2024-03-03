package com.uni.dream.dao.salleDB;

import com.uni.dream.salles.Salle;
import com.uni.dream.batiment.Batiment;
import com.uni.dream.dao.batimentDB.BatimentDao;
import com.uni.dream.factory.SalleFactory;
import com.uni.dream.singletonConnector.SingletonConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalleDAO implements ISalleDB {


    private SingletonConnector singleton = null;
    private Statement statement = null;

    public SalleDAO() {
        this.singleton = SingletonConnector.getInstance();
        try {
            this.statement = this.singleton.getConnection().createStatement();
        } catch (SQLException e) {
            System.out.println("Error creating statement: " + e.getMessage());
        }
    }



    // Method to get all Salle entities from the database
    @Override
    public List<Salle> getSalles() {
        List<Salle> salles = new ArrayList<>();

        try {
            // Use ResultSet to retrieve results from the database
            ResultSet resultSet = statement.executeQuery("SELECT * FROM classe");

            while (resultSet.next()) {
                Salle salle = new Salle() {
                    @Override
                    public void organiserCours() {

                    }
                };
                salle.setIdSalle(resultSet.getInt("idSalle"));
                salle.setNum(resultSet.getString("num"));

                // Get Batiment using the existing method in BatimentDB
                int batimentId = resultSet.getInt("batiment_id");
                Batiment batiment = new BatimentDao().getBatiment(batimentId);
                salle.setBatiment(batiment);

                salles.add(salle);
            }

        } catch (SQLException e) {
            System.out.println("Error getting salles: " + e.getMessage());
        }

        return salles;
    }


    @Override
    public Salle getSalle(int id) {
        try {
            PreparedStatement pstm = this.singleton.getConnection().prepareStatement("SELECT * FROM classe WHERE idSalle=? LIMIT 1");
            pstm.setInt(1, id);
            ResultSet res = pstm.executeQuery();

            if (res.next()) {
                return getConcreteSalle(res); // Utilizing a method to create concrete Salle objects
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to create a concrete Salle object from a ResultSet
    @Override
    public Salle getConcreteSalle(ResultSet res) throws SQLException {
        int classeId = res.getInt("idSalle");
        String num = res.getString("num");


        int batimentId = res.getInt("batiment_id");
        Batiment batiment = new BatimentDao().getBatiment(batimentId);

        // Use the SalleFactory to create the concrete Salle object
        SalleFactory classeFactory = new SalleFactory(new BatimentDao());
        return classeFactory.createSalle(batiment.getGenre()); // Use batiment's genre to determine the Salle type
    }




    @Override
    public void insertSalle(Salle salle) {
        try {
            Connection connection = this.singleton.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO classe (num, batiment_id) VALUES (?, ?)");

            // Set the values for the prepared statement
            preparedStatement.setString(1, salle.getNum());

            // Assuming you have a method to get the ID of the associated Batiment
            int batimentId = salle.getBatiment().getIdBatiment();
            preparedStatement.setInt(2, batimentId);

            // Execute the update
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    }

    @Override
    public void updateSalle(Salle salle, int id) {
        try {
            // Assuming you have a connection and a PreparedStatement
            Connection connection = this.singleton.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE classe SET num = ?, batiment_id = ? WHERE idSalle = ?");

            // Set the values for the prepared statement
            preparedStatement.setString(1, salle.getNum());

            // Assuming you have a method to get the ID of the associated Batiment
            int batimentId = salle.getBatiment().getIdBatiment();
            preparedStatement.setInt(2, batimentId);

            preparedStatement.setInt(3, id);

            // Execute the update
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    }


    @Override
    public void deleteSalle(int id) {
        try {
            // Assuming you have a connection and a PreparedStatement
            Connection connection = this.singleton.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM classe WHERE idSalle = ?");

            // Set the value for the prepared statement
            preparedStatement.setInt(1, id);

            // Execute the deletion
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    }

}
