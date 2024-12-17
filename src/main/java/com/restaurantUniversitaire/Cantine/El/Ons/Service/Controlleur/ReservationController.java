package com.restaurantUniversitaire.Cantine.El.Ons.Service.Controlleur;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.ReservationRequest;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Reservation;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.ReservationRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation.ReservationSergice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    ReservationSergice reservationSergice;
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> register(@RequestBody ReservationRequest reservationRequest) {
        System.out.println(reservationRequest);
        Reservation  reservationOpt =  reservationSergice.Reserver(reservationRequest);
        if(reservationOpt != null) {
            return ResponseEntity.ok(reservationOpt);
        }


        else {
            return ResponseEntity.badRequest().body("Reservation could not be created");
        }
    }
}
