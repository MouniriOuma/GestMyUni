package com.uni.dream.factory;

import com.uni.dream.salles.Salle;

public interface ISalleFactory {
    Salle createSalle(String genre);
}
