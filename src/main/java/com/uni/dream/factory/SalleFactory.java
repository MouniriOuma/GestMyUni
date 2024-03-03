package com.uni.dream.factory;

import com.uni.dream.salles.*;
import com.uni.dream.dao.batimentDB.BatimentDao;
import com.uni.dream.interfaces.SalleTypeResolver;


public  class SalleFactory implements SalleTypeResolver, ISalleFactory {

    private final BatimentDao batimentDao;
    public SalleFactory(BatimentDao batimentDao) {
        this.batimentDao = batimentDao;
    }

    @Override
    public Salle createSalle(String genre) {
        return resolveSalleType(genre);
    }


    // Common method to determine class type based on batiment's genre
    @Override
    public Salle resolveSalleType(String batimentGenre) {
        switch (batimentGenre.toLowerCase()) {
            case "amphi":
                return new Amphi();
                //Salle type is the same as salleDeCours
            case "salleDeCours":
                return new SalleDeCours();
            case "salle":
                return new SalleDeCours();
            case "salleTP":
                return new SalleTP();
            case "sport":
                return new SalleDeSport();
            case "administration":
                return new Bureau();
            default:
                throw new IllegalArgumentException("Unknown genre: " + batimentGenre);
        }
    }


}
