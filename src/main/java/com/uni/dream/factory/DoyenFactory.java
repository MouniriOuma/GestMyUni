package com.uni.dream.factory;

import com.uni.dream.utilisateur.Utilisateur;
import com.uni.dream.utilisateur.personnel.Doyen;

public class DoyenFactory implements IUtilisateurFactory {
    @Override
    public Utilisateur creerUtilisateur() {
        return new Doyen();
    }
}
