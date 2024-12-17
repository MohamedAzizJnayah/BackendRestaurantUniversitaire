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
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> register(@RequestBody Etudiant etudiant) {
        // Affichage pour le débogage
        System.out.println("Nom de l'étudiant: " + etudiant.getNom());
        System.out.println("CIN de l'étudiant: " + etudiant.getCIN());

        // Vérifier que CIN ne soit pas envoyé lors de la création


        Etudiant savedEtudiant = loginService.saveEtudiant(etudiant);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEtudiant);
    }






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
        System.out.println(loginRequestAdmin.getemail());
        System.out.println(loginRequestAdmin.getMotpasse());
        if (admin.isPresent()) {
            return ResponseEntity.ok(admin.get()); // Renvoie l'Admin si trouvé
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Identifiants incorrects.");
        }
    }



}
