package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    private String date;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    private Etudiant etudiant;
    @OneToOne(cascade = CascadeType.ALL)
    private Paiement paiement;
    @ManyToOne(cascade = CascadeType.ALL)
    private Plat plat;

    public Reservation(String date, String description, Etudiant etudiant, Paiement paiement, Plat plat) {
        this.date = date;
        this.description = description;
        this.etudiant = etudiant;
        this.paiement = paiement;
        this.plat = plat;
    }

    public Reservation() {
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", etudiant=" + etudiant +
                ", paiement=" + paiement +
                ", plat=" + plat +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }
}
