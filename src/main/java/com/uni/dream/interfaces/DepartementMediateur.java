package com.uni.dream.interfaces;

import com.uni.dream.chefDepartement.ChefDepartement;

public interface DepartementMediateur {
    void envoyerMessage(String message, ChefDepartement destinataire);
    void recevoirMessage(String message, ChefDepartement expediteur);
}