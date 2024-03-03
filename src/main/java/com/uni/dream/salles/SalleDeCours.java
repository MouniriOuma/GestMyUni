package com.uni.dream.salles;

import com.uni.dream.interfaces.SalleAdapteur;
import com.uni.dream.batiment.Batiment;

public class SalleDeCours extends Salle implements SalleAdapteur {
    public SalleDeCours(Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }

    public SalleDeCours() {
        super();
    }

    @Override
    public void organiserCours() {
        System.out.println("Organiser des cours dans la salle de cours.");
    }

    @Override
    public void organiserFete() {
        // Logique pour organiser une fête dans une salle de cours
        System.out.println("Organiser une fête dans la salle de cours.");
    }

    @Override
    public void organiserSoutenance() {

    }

}
