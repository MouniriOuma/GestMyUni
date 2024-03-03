package com.uni.dream.adapteur;

import com.uni.dream.batiment.Batiment;
import com.uni.dream.interfaces.SalleAdapteur;
import com.uni.dream.salles.Amphi;

public class AdaptateurAmphi extends Amphi implements SalleAdapteur {

    // Constructor
    public AdaptateurAmphi(Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }

    // Implementing the SalleAdapter interface
    @Override
    public void organiserFete() {
        System.out.println("Organiser une fête dans l'amphi de cours.");
    }
}