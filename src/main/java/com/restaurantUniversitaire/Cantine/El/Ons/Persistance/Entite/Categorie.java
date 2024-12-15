package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Categorie {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
}
