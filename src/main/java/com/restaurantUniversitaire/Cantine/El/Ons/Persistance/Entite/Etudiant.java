package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Etudiant
{
    @Id
    private int CIN;
    private String nom;
    private String prenom;
    private String mail;
    private String motpasse;
@OneToMany
    private List<Reservation> reservations;

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public int
    getCIN() {
        return CIN;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
