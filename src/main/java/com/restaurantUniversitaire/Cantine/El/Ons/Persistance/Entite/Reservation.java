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
    private Long id;
    private Date date;
    private String description;
    @ManyToOne
    private Etudiant etudiant;
    @OneToOne
    private Paiement paiement;
    @OneToMany
    private List<Menu> menus;
}
