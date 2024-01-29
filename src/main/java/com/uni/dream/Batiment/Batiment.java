package com.uni.dream.Batiment;

import com.uni.dream.interfaces.IBatiment;

public abstract class Batiment {

    private int idBatiment;
    private String emplacement;
    private int taille;
    private String fonctionnalite;
    private String description;
    private String genre;

    public Batiment() {
        super();
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getFonctionnalite() {
        return fonctionnalite;
    }

    public void setFonctionnalite(String fonctionnalite) {
        this.fonctionnalite = fonctionnalite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Batiment [idBatiment=" + idBatiment + ", emplacement=" + emplacement + ", taille=" + taille
                + ", fonctionnalite=" + fonctionnalite + "]";
    }
}
