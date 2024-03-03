package com.uni.dream.factory;

import com.uni.dream.utilisateur.Utilisateur;
import com.uni.dream.utilisateur.personnel.Enseignant;

public class EnseignantFactory implements IUtilisateurFactory {
    @Override
    public Utilisateur creerUtilisateur() {
        return new Enseignant();
    }
}

