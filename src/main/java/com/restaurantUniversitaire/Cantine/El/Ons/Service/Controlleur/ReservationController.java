package com.restaurantUniversitaire.Cantine.El.Ons.Service.Controlleur;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.DeleteReservationRequest;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.LoginRequestEtd;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.ReservationRequest;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Reservation;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation.ReservationSergice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //Display list of reservations by Student
    @PostMapping("/listeReservation")
    public ResponseEntity<?> register(@RequestBody LoginRequestEtd loginRequest) {
        List<Reservation> reservations = reservationSergice.listeReservationsEtudiant(loginRequest);
        if(reservations != null) {
            return ResponseEntity.ok(reservations);
        }
        else {
            return ResponseEntity.badRequest().body("Reservations could not be found");
        }
    }

    //Delete Reservation By I'd Reservation
    @DeleteMapping("/deleteReservation")
    public ResponseEntity<String> deleteReservation(@RequestBody DeleteReservationRequest deleteReservationRequest) {
        // Vérification si l'ID est valide
        if (deleteReservationRequest.getId() <= 0) {
            return ResponseEntity.badRequest().body("ID de réservation invalide.");
        }

        // Suppression de la réservation
        boolean isDeleted = reservationSergice.deleteReservation(deleteReservationRequest.getId()); // Corrected typo 'reservationSergice' to 'reservationService'
        if (isDeleted) {
            return ResponseEntity.ok("Réservation supprimée avec succès");
        } else {
            return ResponseEntity.badRequest().body("Impossible de supprimer la réservation. ID non trouvé.");
        }
    }


}
