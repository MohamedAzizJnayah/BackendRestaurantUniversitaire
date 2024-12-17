package com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.*;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.ReservationRequest;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.EtudiantRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.PaiementRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.PlatRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.ReservationRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface.ReservationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationSergice implements ReservationInterface {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private PaiementService paiementService;
    @Autowired
    private EtudiantRepository etudiantRepository;  // Ajouter un repository pour l'étudiant
    @Autowired
    private PlatRepository platRepository;  // Ajouter un repository pour le plat

    @Override
    public Reservation Reserver(ReservationRequest reservationRequest) {
        // Recherche de l'étudiant par CIN
        Optional<Etudiant> etudiantOpt = etudiantRepository.findById(reservationRequest.getEtudiant().getCIN());
        Etudiant etudiant = etudiantOpt.orElseThrow(() -> new RuntimeException("Etudiant non trouvé"));

        // Recherche du plat par ID
        Optional<Plat> platOpt = platRepository.findById(reservationRequest.getPlat().getId());
        Plat plat = platOpt.orElseThrow(() -> new RuntimeException("Plat non trouvé"));

        // Création du paiement
        Paiement paiement = new Paiement(plat.getPrix(), reservationRequest.getMethodePaiement());
        Paiement paiement1 = paiementService.savePaiement(paiement);

        // Création de la réservation
        Reservation reservation = new Reservation(reservationRequest.getDate(), reservationRequest.getDescription(), etudiant, paiement1, plat);

        // Sauvegarde de la réservation dans la base de données
        return reservationRepository.save(reservation);
    }
}



