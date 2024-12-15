package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Plat {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private float prix;
}
