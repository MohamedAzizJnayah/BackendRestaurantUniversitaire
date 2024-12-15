package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.dao;
import com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
}
