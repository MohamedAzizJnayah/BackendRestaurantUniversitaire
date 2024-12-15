package com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Admin;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;

import java.util.Optional;

public interface LoginInterface {
    public void saveEtudiant(Etudiant etudiant);
    public Optional<Etudiant> etudiantLogin(Long Cin , String motpasse);
    public Optional<Admin> adminLogin(String mail, String motpasse);
}
