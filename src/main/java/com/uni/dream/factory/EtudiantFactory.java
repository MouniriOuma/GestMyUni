package com.uni.dream.factory;

import com.uni.dream.utilisateur.Utilisateur;
import com.uni.dream.utilisateur.etudiant.Etudiant;

public class EtudiantFactory implements IUtilisateurFactory {
    @Override
    public Utilisateur creerUtilisateur() {
        return new Etudiant();
    }
}
