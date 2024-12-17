package com.restaurantUniversitaire.Cantine.El.Ons.Service.Controlleur;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Categorie;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Reservation;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.CategorieRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")  // Permet les requêtes CORS de n'importe quelle origine
@RequestMapping("/api/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    // Utilisation de @GetMapping pour une requête GET
    @GetMapping(produces = "application/json")
    public ResponseEntity<?> getCategories() {
        List<Categorie> categories = categorieService.getAllCategorie();
        for (int i = 0; i < categories.size(); i++) {
            System.out.println("la categorie est "+categories.get(i).getNom());
        }
        if (categories != null && !categories.isEmpty()) {  // Vérification que la liste n'est pas vide
            return ResponseEntity.ok(categories);
        } else {
            return ResponseEntity.badRequest().body("Categories could not be found");
        }
    }
}

