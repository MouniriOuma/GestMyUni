package com.uni.dream.salles;

import com.uni.dream.batiment.Batiment;

public class SalleDeSport extends Salle {
    public SalleDeSport(Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }


    public SalleDeSport() {
    }

    @Override
    public void organiserCours() {
        System.out.println("Organiser des cours dans la salle de cours.");
    }
}
