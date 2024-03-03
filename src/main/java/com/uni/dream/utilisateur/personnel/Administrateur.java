package com.uni.dream.utilisateur.personnel;

import com.uni.dream.utilisateur.personnel.Personnel;

public class Administrateur extends Personnel {

    // Constructors
    public Administrateur() {
        super();
    }

    public Administrateur(int id, String nom, String prenom, String fonction, String type) {
        super(id, nom, prenom, fonction, type);
    }
}
