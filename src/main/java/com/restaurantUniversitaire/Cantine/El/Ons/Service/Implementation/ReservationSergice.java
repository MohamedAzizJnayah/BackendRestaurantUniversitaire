package com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Menu;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Reservation;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.ReservationRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationSergice implements ReservationInterface {
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public Reservation Reserver(Reservation reservation) {

        return reservationRepository.save(reservation);

    }
}
