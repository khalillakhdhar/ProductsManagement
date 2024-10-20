package com.elitech.services;

import java.util.List;

import com.elitech.entity.Produit;

public interface ProduitServiceInterface {
public List<Produit> getAllProduits();
public Produit addOneProduit(Produit produit);
public Produit findOneProduit(long id);
public List<Produit> findByDescriptionContent(String description);
public List<Produit> findByTitreOrDescriptionContent(String titre,String description);

public List<Produit> findByTitre(String titre);
public List<Produit> findByQuantiteLessThan(int quantite);
public void deleteOneProduit(long id);
}
