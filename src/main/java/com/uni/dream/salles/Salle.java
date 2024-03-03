package com.uni.dream.salles;



import com.uni.dream.interfaces.SalleAdapteur;
import com.uni.dream.batiment.Batiment;


public abstract class Salle implements SalleAdapteur {
    private Integer idSalle;
    private String num;
    private Batiment batiment;

    public Salle(Integer idSalle, String num, Batiment batiment) {
        this.idSalle = idSalle;
        this.num = num;
        this.batiment = batiment;
    }

    public Salle() {
        super();
    }

    // Abstract method for specific behavior
    public abstract void organiserCours();

    // Getters and Setters

    public Integer getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(Integer idSalle) {
        this.idSalle = idSalle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Batiment getBatiment() {
        return batiment;
    }

    public void setBatiment(Batiment batiment) {
        this.batiment = batiment;
    }

    @Override
    public String toString() {
        return "Salles{" +
                "num='" + num + '\'' +
                ", batiment=" + batiment +
                '}';
    }

    @Override
    public void organiserFete() {
        // Logique pour organiser une fête dans une salle de cours
        System.out.println("Organiser une fête dans la salle de cours.");
    }

    @Override
    public void organiserSoutenance() {
        // Logique pour organiser une soutenance dans une salle de cours
        System.out.println("Organiser une soutenance dans la salle de cours.");
    }

    // Ajoutez d'autres méthodes spécifiques à la salle de cours si nécessaire
}
