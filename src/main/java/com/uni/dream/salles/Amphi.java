package com.uni.dream.salles;

import com.uni.dream.interfaces.SalleAdapteur;
import com.uni.dream.batiment.Batiment;

public class Amphi extends Salle implements SalleAdapteur {

    public Amphi(Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }

    public Amphi() {
        super();
    }

    @Override
    public void organiserCours() {
        System.out.println("Organiser des cours dans l'amphi.");
    }


    @Override
    public void organiserFete() {

    }

    @Override
    public void organiserSoutenance() {
        // Logique pour organiser une soutenance dans une salle de cours
        System.out.println("Organiser une soutenance dans la salle de cours.");
    }
}
