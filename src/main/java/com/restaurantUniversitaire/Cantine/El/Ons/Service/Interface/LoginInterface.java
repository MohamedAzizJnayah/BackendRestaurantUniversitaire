package com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Admin;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;

import java.util.Optional;

public interface LoginInterface {
    public Etudiant saveEtudiant(Etudiant etudiant);
    public Optional<Etudiant> etudiantLogin(int Cin , String motpasse);
    public Optional<Admin> adminLogin(String mail, String motpasse);
}
