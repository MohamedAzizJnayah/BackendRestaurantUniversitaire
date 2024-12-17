package com.restaurantUniversitaire.Cantine.El.Ons.Service.Controlleur;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Plat;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation.PlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/plat")
public class PlatController {

 @Autowired
    private PlatService platService ;

    @GetMapping("{menuId}")
    public List<Plat> getPlatsByMenu(@PathVariable int menuId) {

        return platService.getPlatsByMenuId(menuId);
    }
}
