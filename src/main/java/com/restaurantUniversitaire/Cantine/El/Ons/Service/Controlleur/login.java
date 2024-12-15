package com.restaurantUniversitaire.Cantine.El.Ons.Service.Controlleur;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Admin;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Etudiant;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.LoginRequestAdmin;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite.LoginRequestEtd;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/login")
public class login {
    @Autowired
    LoginService loginService;
    @PostMapping("/etudiant")
    public ResponseEntity<?> login(@RequestBody LoginRequestEtd loginRequestEtd) {
        Optional<Etudiant> etudiant = loginService.etudiantLogin(loginRequestEtd.getCin() , loginRequestEtd.getMotpasse());
        if (etudiant.isPresent()) {
            return ResponseEntity.ok(etudiant.get()); // Renvoie l'étudiant si trouvé
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants incorrects.");
        }
    }
    @PostMapping("/admin")
    public ResponseEntity<?> login(@RequestBody LoginRequestAdmin loginRequestAdmin) {
        Optional<Admin> admin = loginService.adminLogin(loginRequestAdmin.getemail(), loginRequestAdmin.getMotpasse());
        if (admin.isPresent()) {
            return ResponseEntity.ok(admin.get()); // Renvoie l'étudiant si trouvé
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants incorrects.");
        }
    }


}
