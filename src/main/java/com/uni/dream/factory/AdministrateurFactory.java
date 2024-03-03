package com.uni.dream.factory;

import com.uni.dream.utilisateur.Utilisateur;
import com.uni.dream.utilisateur.personnel.Administrateur;

public class AdministrateurFactory implements IUtilisateurFactory {
    @Override
    public Utilisateur creerUtilisateur() {
        return new Administrateur();
    }
}
