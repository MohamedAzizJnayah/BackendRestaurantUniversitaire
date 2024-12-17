package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Menu;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Plat;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Registered
public interface PlatRepository extends JpaRepository<Plat, Integer> {

        Optional<Plat> findById(Long id);  // Recherche du plat par ID
    }


