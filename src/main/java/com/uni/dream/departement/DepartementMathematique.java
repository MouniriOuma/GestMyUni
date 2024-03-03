package com.uni.dream.departement;

import com.uni.dream.chefDepartement.ChefDepartement;
import com.uni.dream.utilisateur.etudiant.Etudiant;

import java.util.List;

public class DepartementMathematique extends Departement {
    public DepartementMathematique(String nom, ChefDepartement chefDepartement, List<Etudiant> etudiants) {
        super(nom, chefDepartement, etudiants);
    }
}

