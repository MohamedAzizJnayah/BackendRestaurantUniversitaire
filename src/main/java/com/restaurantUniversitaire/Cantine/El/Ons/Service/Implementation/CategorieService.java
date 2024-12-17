package com.restaurantUniversitaire.Cantine.El.Ons.Service.Implementation;

import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Categorie;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao.CategorieRepository;
import com.restaurantUniversitaire.Cantine.El.Ons.Service.Interface.categorieInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements categorieInterface {
    @Autowired
    CategorieRepository categorieRepository;
    @Override
    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }
}
