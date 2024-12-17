package com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Paiement;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaiementService {
    @Autowired
    private PaiementRepository paiementRepository;
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}
