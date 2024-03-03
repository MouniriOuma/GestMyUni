package com.uni.dream.mediateur;

import com.uni.dream.chefDepartement.ChefDepartement;
import com.uni.dream.interfaces.DepartementMediateur;

public class DepartementMediateurImpl implements DepartementMediateur {
    @Override
    public void envoyerMessage(String message, ChefDepartement destinataire) {
        System.out.println("Message envoyé à " + destinataire.getNomChef() + " du département " + destinataire.getNomDepartement() + ": " + message);
    }

    @Override
    public void recevoirMessage(String message, ChefDepartement expediteur) {
        System.out.println("Message reçu de " + expediteur.getNomChef() + " du département " + expediteur.getNomDepartement() + ": " + message);
    }
}