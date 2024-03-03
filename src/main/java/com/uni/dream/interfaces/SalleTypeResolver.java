package com.uni.dream.interfaces;

import com.uni.dream.salles.Salle;

public interface SalleTypeResolver {
    Salle resolveSalleType(String batimentGenre);
}