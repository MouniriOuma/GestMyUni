package com.uni.dream.dao.utilisateurDB;

import com.uni.dream.utilisateur.Utilisateur;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface IUtilisateurDB {
    Utilisateur getUtilisateurs(ResultSet res);
    ArrayList<Utilisateur> getUtilisateurs();
    ArrayList<Utilisateur> getUtilisateurs(String genre);
    int updateUtilisateur(Utilisateur batiment, int idUtilisateur);
    int deleteUtilisateur(int idUtilisateur);
    int insertUtilisateur(Utilisateur batiment);
    Utilisateur getUtilisateur(int idUtilisateur);

    String getUtilisateurGenreById(int idUtilisateur);
}
