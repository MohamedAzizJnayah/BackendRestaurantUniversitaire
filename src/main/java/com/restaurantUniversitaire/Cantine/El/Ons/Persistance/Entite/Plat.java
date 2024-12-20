package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Plat {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private float prix;
    String image;
    @ManyToOne
    private Menu menu;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "plat")
    List<Reservation> reservations;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrix() {
        return prix;
    }

    public String getImage() {
        return image;
    }
}
