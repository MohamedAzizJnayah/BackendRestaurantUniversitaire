package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

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
    @ManyToOne
    private Plat plat;


}
