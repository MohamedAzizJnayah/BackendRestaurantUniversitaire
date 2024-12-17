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
    @OneToMany(cascade = CascadeType.ALL)
    private List<Plat> plats;

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", etudiant=" + etudiant +
                ", paiement=" + paiement +
                ", plats=" + plats +
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

    public List<Plat> getPlats() {
        return plats;
    }

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
}
