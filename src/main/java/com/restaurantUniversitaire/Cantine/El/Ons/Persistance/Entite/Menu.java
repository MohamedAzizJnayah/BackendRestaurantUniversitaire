package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @OneToOne
    private Categorie categorie;
    @OneToMany
    private List<Plat> plats;


}
