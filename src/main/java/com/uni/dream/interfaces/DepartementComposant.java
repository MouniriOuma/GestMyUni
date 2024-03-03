package com.uni.dream.interfaces;

import com.uni.dream.departement.Departement;

public interface DepartementComposant {
    void afficherDetails();
    void supprimerDepartement(DepartementComposant departement);
    void ajouterDepartement(DepartementComposant departement);
}
