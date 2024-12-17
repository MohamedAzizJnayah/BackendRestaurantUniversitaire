package com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Menu;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Reservation;

import java.util.Optional;


public interface ReservationInterface {
    public Reservation Reserver(Reservation reservation);
}
