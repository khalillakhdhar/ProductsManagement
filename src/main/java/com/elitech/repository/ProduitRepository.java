package com.elitech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
public List<Produit> findByDescriptionContaining(String description);
public List<Produit> findByTitreOrDescriptionContaining(String titre,String description);
public  List<Produit> findByTitre(String titre);
public List<Produit> findByQuantiteLessThan(int quantite);


}
