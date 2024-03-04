package com.uni.dream.dao.departementDB;

import com.uni.dream.departement.Departement;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DepartementDB implements IDepartementDB{
    @Override
    public Departement getDepartement(ResultSet res) {
        return null;
    }

    @Override
    public ArrayList<Departement> getDepartements() {
        return null;
    }

    @Override
    public ArrayList<Departement> getDepartements(String genre) {
        return null;
    }

    @Override
    public int updateDepartement(Departement batiment, int idDepartement) {
        return 0;
    }

    @Override
    public int deleteDepartement(int idDepartement) {
        return 0;
    }

    @Override
    public int insertDepartement(Departement batiment) {
        return 0;
    }

    @Override
    public Departement getDepartement(int idDepartement) {
        return null;
    }

    @Override
    public String getDepartementGenreById(int idDepartement) {
        return null;
    }
}
