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
    private List<Menu> menus;

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", etudiant=" + etudiant +
                ", paiement=" + paiement +
                ", menus=" + menus +
                '}';
    }
}
