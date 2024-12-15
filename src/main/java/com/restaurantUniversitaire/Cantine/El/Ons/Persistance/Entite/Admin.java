package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin  {
    @Id
    private String email;
    private String motpass;

    public String getMotpass() {
        return motpass;
    }

    public String getEmail() {
        return email;
    }
}
