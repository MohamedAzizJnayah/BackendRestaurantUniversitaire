package com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Menu;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Plat;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.MenuRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatService {
   @Autowired
    private MenuRepository menuRepository;
   @Autowired
   private PlatRepository platRepository;
    public List<Plat> getPlatsByMenuId(int menuId) {
        Menu menu = menuRepository.findById(menuId);
        if (menu != null) {
            return menu.getPlats(); // Retourne la liste des plats du menu
        }
        return null; // Retourne null si le menu n'existe pas
    }
}
