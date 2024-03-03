package com.uni.dream.chefDepartement;

public class ChefDepartement {
    private int idChef;
    private String nomDepartement;
    private String nomChef;

    // Constructor
    public ChefDepartement(int idChef, String nomDepartement, String nomChef) {
        this.idChef = idChef;
        this.nomDepartement = nomDepartement;
        this.nomChef = nomChef;
    }

    // Getters
    public int getIdChef() {
        return idChef;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public String getNomChef() {
        return nomChef;
    }
}
