package com.uni.dream.utilisateur.personnel;

import com.uni.dream.utilisateur.personnel.Personnel;
public class Enseignant extends Personnel {

    // Constructors
    public Enseignant() {
        super();
    }

    public Enseignant(int id, String nom, String prenom, String fonction, String type) {
        super(id, nom, prenom, fonction, type);
    }
}

