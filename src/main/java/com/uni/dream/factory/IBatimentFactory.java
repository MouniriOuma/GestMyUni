package com.uni.dream.factory;

import com.uni.dream.batiment.Batiment;

public interface IBatimentFactory {

    Batiment creerBatiment(String genre);
}
