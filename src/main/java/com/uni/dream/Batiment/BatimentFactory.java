package com.uni.dream.Batiment;

import com.uni.dream.interfaces.IBatiment;

public class BatimentFactory implements IBatiment {

    public Batiment creerBatiment(String genre) {

        switch (genre.toLowerCase()) {
            case "sallecour":
                return new SalleCourBatiment();
            case "sport":
                return new SportBatiment();
            case "administration":
                return new AdministrationBatiment();
            case "amphi":
                return new AmphiBatiment();
            case "salleTP":
                return new SalleTPBatiment();
            default:
                throw new IllegalArgumentException("Unknown genre: " + genre);
        }
    }
}
