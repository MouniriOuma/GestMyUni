package com.uni.dream.salles;

import com.uni.dream.batiment.Batiment;

public class SalleTP extends Salle {
    public SalleTP (Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }

    public SalleTP() {
        super();
    }

    @Override
    public void organiserCours() {
        System.out.println("Organiser des TPs dans les salles de tp.");
    }
}
