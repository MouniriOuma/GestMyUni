package com.uni.dream.dao.salleDB;

import com.uni.dream.salles.Salle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ISalleDB {
    // Retrieve a list of all classes
    List<Salle> getSalles();

    // Retrieve a specific class by its ID
    Salle getSalle(int id);

    // Method to create a concrete Salle object from a ResultSet
    Salle getConcreteSalle(ResultSet res) throws SQLException;

    // Insert a new class into the data source
    void insertSalle(Salle salle);

    // Update an existing class in the data source
    void updateSalle(Salle salle, int id);

    // Delete a class from the data source based on its ID
    void deleteSalle(int id);
}
