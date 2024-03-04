package com.uni.dream.dao.departementDB;

import com.uni.dream.departement.Departement;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface IDepartementDB {
    Departement getDepartement(ResultSet res);
    ArrayList<Departement> getDepartements();
    ArrayList<Departement> getDepartements(String genre);
    int updateDepartement(Departement batiment, int idDepartement);
    int deleteDepartement(int idDepartement);
    int insertDepartement(Departement batiment);
    Departement getDepartement(int idDepartement);

    String getDepartementGenreById(int idDepartement);
}
