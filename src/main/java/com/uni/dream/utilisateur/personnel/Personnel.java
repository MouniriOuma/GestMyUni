package com.uni.dream.utilisateur.personnel;

import com.uni.dream.utilisateur.Utilisateur;

public class Personnel extends Utilisateur {
    private String fonction;
    private String type;

    // Constructors
    public Personnel() {
        super();
    }

    public Personnel(int id, String nom, String prenom, String fonction, String type) {
        super(id, nom, prenom);
        this.fonction = fonction;
        this.type = type;
    }

    // Getters and Setters
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
