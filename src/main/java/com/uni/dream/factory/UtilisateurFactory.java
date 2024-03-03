package com.uni.dream.factory;

import com.uni.dream.utilisateur.Utilisateur;

public class UtilisateurFactory {
    public static Utilisateur getUtilisateur(IUtilisateurFactory factory) {
        return factory.creerUtilisateur();
    }
}

