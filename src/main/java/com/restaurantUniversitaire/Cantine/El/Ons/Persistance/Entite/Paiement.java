package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Paiement {
    @Id
    @GeneratedValue
    private int id;
    private float montant;
    private String methode;

    public Paiement(float montant, String method) {
        this.montant = montant;
        this.methode = methode;

    }

    public Paiement() {

    }
}
