package com.uni.dream.dao.batimentDB;


import com.uni.dream.batiment.Batiment;
import com.uni.dream.factory.BatimentFactory;
import com.uni.dream.singletonConnector.SingletonConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BatimentDao implements IBatimentDao {
    private SingletonConnector singleton = null;
    private Statement statement = null;

    public BatimentDao() {
        this.singleton = SingletonConnector.getInstance();
        try {
            this.statement = this.singleton.getConnection().createStatement();
        } catch (SQLException e) {
            System.out.println("Error creating statement : "+e.getMessage());
        }
    }

    @Override
    public int deleteBatiment(int id) {
        try {
            String requetSQL = "delete from batiment where idBatiment=?";
            PreparedStatement pstmt= this.singleton.getConnection().prepareStatement(requetSQL);
            pstmt.setInt(1, id);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error in deleteBatiment: "+e.getMessage());
        }
        return 0;
    }

    @Override
    public int updateBatiment(Batiment batiment, int idBatiment) {
        try {
            PreparedStatement p = this.singleton.getConnection()
                    .prepareStatement("UPDATE batiment SET description=?, emplacement=?, taille=?, fonctionalite=?,"
                            + " genre=? WHERE idBatiment=?");
            p.setString(1, batiment.getDescription());
            p.setString(2, batiment.getEmplacement());
            p.setInt(3, batiment.getTaille());
            p.setString(4, batiment.getFonctionnalite());
            p.setString(5, batiment.getGenre());
            p.setInt(6, batiment.getIdBatiment());

            return p.executeUpdate();
        } catch (Exception exception) {
            System.out.println("Error in updateBatiment: "+exception.getMessage());
        }
        return 0;
    }

    @Override
    public ArrayList<Batiment> getBatiments() {
        // TODO Auto-generated method stub
        String requeteSql = "select * from batiment";
        ArrayList<Batiment> batiments = new ArrayList<>();
        try {
            ResultSet res = this.statement.executeQuery(requeteSql);
            while (res.next()) {
                batiments.add(this.getBatiment(res));
            }
        } catch (SQLException e) {
            System.out.println("Error <ArrayList>getBatiment() : " + e.getMessage());
        }
        return batiments;
    }

    @Override
    public Batiment getBatiment(ResultSet res) {
        // TODO Auto-generated method stub
        Batiment batiment = null;
        try {
            batiment = new BatimentFactory().creerBatiment(res.getString("genre"));
            batiment.setDescription(res.getString("description"));
            batiment.setEmplacement(res.getString("emplacement"));
            batiment.setFonctionnalite(res.getString("fonctionnalite"));
            batiment.setGenre(res.getString("genre"));
            batiment.setTaille(res.getInt("taille"));
            batiment.setIdBatiment(res.getInt("idBatiment"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return batiment;
    }

    @Override
    public ArrayList<Batiment> getBatiments(String genre) {
        // TODO Auto-generated method stub
        String requeteSql = "select * from batiment where genre = ?";

        ArrayList<Batiment> batiments = new ArrayList<>();
        try {
            PreparedStatement pstmt = this.singleton.getConnection()
                    .prepareStatement("select * from batiments where genre=?");
            pstmt.setString(1, genre);
            ResultSet res = pstmt.executeQuery(requeteSql);
            while (res.next()) {
                batiments.add(this.getBatiment(res));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return batiments;
    }

    @Override
    public int insertBatiment(Batiment batiment) {
        // TODO Auto-generated method stub
        try {
            PreparedStatement pstm = this.singleton.getConnection()
                    .prepareStatement("insert into batiment(description,emplacement, taille, fonctionalite,genre) "
                            + "values(?,?,?,?,?)");
            pstm.setString(1, batiment.getDescription());
            pstm.setString(2, batiment.getEmplacement());
            pstm.setInt(3, batiment.getTaille());
            pstm.setString(4, batiment.getFonctionnalite());
            pstm.setString(5, batiment.getGenre());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Batiment getBatiment(int idBatiment) {
        // TODO Auto-generated method stub
        try {
            PreparedStatement pstm = this.singleton.getConnection().prepareStatement("select * from batiment where idBatiment=? limit 1");
            pstm.setInt(1, idBatiment);
            ResultSet res = pstm.executeQuery();
            if (res.next()) {
                return this.getBatiment(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public String getBatimentGenreById(int idBatiment) {
        String genre = null;

        try {
            PreparedStatement pstmt = this.singleton.getConnection().prepareStatement("SELECT genre FROM batiment WHERE idBatiment = ?");
            pstmt.setInt(1, idBatiment);
            ResultSet res = pstmt.executeQuery();

            if (res.next()) {
                genre = res.getString("genre");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return genre;
    }



}

