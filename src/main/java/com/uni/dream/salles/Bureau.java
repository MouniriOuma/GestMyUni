package com.uni.dream.salles;


import com.uni.dream.batiment.Batiment;
public class Bureau extends Salle {
    public Bureau(Integer idSalle, String num, Batiment batiment) {
        super(idSalle, num, batiment);
    }

    public Bureau() {
    }

    @Override
    public void organiserCours() {

    }
}
