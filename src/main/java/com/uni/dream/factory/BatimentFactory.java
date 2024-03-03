package com.uni.dream.factory;

import com.uni.dream.batiment.*;
import com.uni.dream.factory.IBatimentFactory;

public class BatimentFactory implements IBatimentFactory {

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
