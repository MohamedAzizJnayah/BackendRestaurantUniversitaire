package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;
import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    @OneToOne
    private Categorie categorie;
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<Plat> plats;

    public List<Plat> getPlats() {
        return plats;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Categorie getCategorie() {
        return categorie;
    }


}
