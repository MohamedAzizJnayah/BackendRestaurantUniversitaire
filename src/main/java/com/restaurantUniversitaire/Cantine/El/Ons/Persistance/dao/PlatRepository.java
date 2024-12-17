package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Plat;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface PlatRepository extends JpaRepository<Plat, Integer> {
}
