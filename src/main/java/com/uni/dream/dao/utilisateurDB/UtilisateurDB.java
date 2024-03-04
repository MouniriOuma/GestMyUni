package com.uni.dream.dao.utilisateurDB;

import com.uni.dream.utilisateur.Utilisateur;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UtilisateurDB implements IUtilisateurDB{
    @Override
    public Utilisateur getUtilisateurs(ResultSet res) {
        return null;
    }

    @Override
    public ArrayList<Utilisateur> getUtilisateurs() {
        return null;
    }

    @Override
    public ArrayList<Utilisateur> getUtilisateurs(String genre) {
        return null;
    }

    @Override
    public int updateUtilisateur(Utilisateur batiment, int idUtilisateur) {
        return 0;
    }

    @Override
    public int deleteUtilisateur(int idUtilisateur) {
        return 0;
    }

    @Override
    public int insertUtilisateur(Utilisateur batiment) {
        return 0;
    }

    @Override
    public Utilisateur getUtilisateur(int idUtilisateur) {
        return null;
    }

    @Override
    public String getUtilisateurGenreById(int idUtilisateur) {
        return null;
    }
}
