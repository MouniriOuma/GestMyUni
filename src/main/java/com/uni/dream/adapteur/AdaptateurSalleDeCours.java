package com.uni.dream.adapteur;

import com.uni.dream.batiment.Batiment;
import com.uni.dream.interfaces.SalleAdapteur;
import com.uni.dream.salles.SalleDeCours;

public class AdaptateurSalleDeCours extends SalleDeCours implements SalleAdapteur {

    // Constructor
    public AdaptateurSalleDeCours(Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }

    // Implementing the SalleAdapter interface
    @Override
    public void organiserSoutenance() {
        System.out.println("Organiser un soutenance dans la salle de cours.");
    }
}