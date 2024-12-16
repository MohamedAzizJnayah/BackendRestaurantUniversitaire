package com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Admin;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.AdminRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.EtudiantRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface.LoginInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService implements LoginInterface {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }


    public Boolean ExistEtudiant(int Cin) {
    Optional<Etudiant> etudiantOptional = etudiantRepository.findById(Cin);
    if (etudiantOptional.isPresent()){
        return true;
    }
    return false;
}
    @Override
    public Optional<Etudiant> etudiantLogin(int Cin, String motpasse) {
        Optional<Etudiant> etudiantOptional = etudiantRepository.findById(Cin);
        if (etudiantOptional.isPresent() && etudiantOptional.get().getMotpasse().equals(motpasse)) {
            return etudiantOptional;
        }
        return Optional.empty();
    }


    @Override
    public Optional<Admin> adminLogin(String mail , String motpass) {
        Optional<Admin> adminOptional = adminRepository.findById(mail);
        if (adminOptional.isPresent() && adminOptional.get().getMotpass().equals(motpass)) {
            return adminOptional;
        }
        return  Optional.empty();
    }
}
