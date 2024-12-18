package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    public Etudiant save(Etudiant etudiant);


    Optional<Etudiant> findById(int cin);


}
