package com.uni.dream.utilisateur.etudiant;

import com.uni.dream.utilisateur.Utilisateur;

public class Etudiant extends Utilisateur {
    private String code;
    private String situationScolaire;

    // Constructors
    public Etudiant() {
        super();
    }

    public Etudiant(int id, String nom, String prenom, String code, String situationScolaire) {
        super(id, nom, prenom);
        this.code = code;
        this.situationScolaire = situationScolaire;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSituationScolaire() {
        return situationScolaire;
    }

    public void setSituationScolaire(String situationScolaire) {
        this.situationScolaire = situationScolaire;
    }
}