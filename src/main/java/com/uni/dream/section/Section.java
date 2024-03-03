package com.uni.dream.section;

import com.uni.dream.utilisateur.etudiant.Etudiant;
import com.uni.dream.utilisateur.personnel.Enseignant;

import java.util.List;

public class Section {
    private int nombreEtudiants;
    private Enseignant enseignantAffecte;
    private List<Etudiant> etudiants;

    // Constructeur
    public Section(int nombreEtudiants, Enseignant enseignantAffecte, List<Etudiant> etudiants) {
        this.nombreEtudiants = nombreEtudiants;
        this.enseignantAffecte = enseignantAffecte;
        this.etudiants = etudiants;
    }

    // Getters et Setters
    public int getNombreEtudiants() {
        return nombreEtudiants;
    }

    public void setNombreEtudiants(int nombreEtudiants) {
        this.nombreEtudiants = nombreEtudiants;
    }

    public Enseignant getEnseignantAffecte() {
        return enseignantAffecte;
    }

    public void setEnseignantAffecte(Enseignant enseignantAffecte) {
        this.enseignantAffecte = enseignantAffecte;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}

