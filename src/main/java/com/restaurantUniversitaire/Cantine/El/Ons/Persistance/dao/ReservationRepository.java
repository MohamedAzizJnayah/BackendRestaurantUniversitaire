package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
