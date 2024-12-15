package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Etudiant
{
    @Id
    private Long CIN;
    private String nom;
    private String prenom;
    private String mail;
    private String motpasse;
@OneToMany
    private List<Reservation> reservations;

    public Long getCIN() {
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
