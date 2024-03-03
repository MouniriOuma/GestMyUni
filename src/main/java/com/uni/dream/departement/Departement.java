package com.uni.dream.departement;

import com.uni.dream.chefDepartement.ChefDepartement;
import com.uni.dream.interfaces.DepartementComposant;
import com.uni.dream.utilisateur.etudiant.Etudiant;

import java.util.List;

public abstract class Departement implements DepartementComposant {
    private String nom;
    private ChefDepartement chefDepartement;
    private List<Etudiant> etudiants;

    // Constructeur
    public Departement(String nom, ChefDepartement chefDepartement, List<Etudiant> etudiants) {
        this.nom = nom;
        this.chefDepartement = chefDepartement;
        this.etudiants = etudiants;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ChefDepartement getChefDepartement() {
        return chefDepartement;
    }

    public void setChefDepartement(ChefDepartement chefDepartement) {
        this.chefDepartement = chefDepartement;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public void afficherDetails() {
        // Implémentation pour afficher les détails du département
        System.out.println("Nom du département : " + nom);
        // Afficher les détails du chef du département, des étudiants, etc.
    }

    @Override
    public void supprimerDepartement(DepartementComposant departement) {
        // Impossible de supprimer un département individuel
        System.out.println("Impossible de supprimer un département individuel.");
    }

    @Override
    public void ajouterDepartement(DepartementComposant departement) {
        // Impossible d'ajouter un département à un département individuel
        System.out.println("Impossible d'ajouter un département à un département individuel.");
    }
}
