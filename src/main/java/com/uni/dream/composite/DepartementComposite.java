package com.uni.dream.composite;

import com.uni.dream.departement.Departement;
import com.uni.dream.interfaces.DepartementComposant;

import java.util.ArrayList;
import java.util.List;

public class DepartementComposite implements DepartementComposant {
    private List<DepartementComposant> departements;

    // Constructeur, getters et setters


    public DepartementComposite() {
    }

    public DepartementComposite(List<DepartementComposant> departements) {
        this.departements = departements;
    }

    public List<DepartementComposant> getDepartements() {
        return departements;
    }

    public void setDepartements(List<DepartementComposant> departements) {
        this.departements = departements;
    }

    @Override
    public void afficherDetails() {
        for (DepartementComposant departement : departements) {
            departement.afficherDetails();
        }
    }

    @Override
    public void supprimerDepartement(DepartementComposant departement) {
        departements.remove(departement);
    }

    @Override
    public void ajouterDepartement(DepartementComposant departement) {
        departements.add(departement);
    }
}