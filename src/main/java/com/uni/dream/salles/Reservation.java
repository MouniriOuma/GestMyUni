package com.uni.dream.salles;


import java.sql.Timestamp;

public class Reservation {
    private int idReservation;
    private int idSalle; // Foreign key referencing classes table
    private String reservePar;
    private Timestamp dateReservation;

    public Reservation() {
    }

    public Reservation(int idReservation, int idSalle, String reservePar, Timestamp dateReservation) {
        this.idReservation = idReservation;
        this.idSalle = idSalle;
        this.reservePar = reservePar;
        this.dateReservation = dateReservation;
    }

    // Getters and Setters
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getReservePar() {
        return reservePar;
    }

    public void setReservePar(String reservePar) {
        this.reservePar = reservePar;
    }

    public Timestamp getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Timestamp dateReservation) {
        this.dateReservation = dateReservation;
    }
}
