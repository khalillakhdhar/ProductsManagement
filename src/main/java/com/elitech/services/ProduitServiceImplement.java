package com.elitech.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elitech.entity.Produit;
import com.elitech.repository.ProduitRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProduitServiceImplement implements ProduitServiceInterface {

	private final ProduitRepository produitRepository;
	
	
	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit addOneProduit(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public Produit findOneProduit(long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).orElse(null);
	}

	@Override
	public List<Produit> findByDescriptionContent(String description) {
		// TODO Auto-generated method stub
		return produitRepository.findByDescriptionContaining(description);
	}

	@Override
	public List<Produit> findByTitre(String titre) {
		// TODO Auto-generated method stub
		return produitRepository.findByTitre(titre);
	}

	@Override
	public List<Produit> findByQuantiteLessThan(int quantite) {
		// TODO Auto-generated method stub
		return  produitRepository.findByQuantiteLessThan(quantite);
	}

	@Override
	public void deleteOneProduit(long id) {
		// TODO Auto-generated method stub
		if(produitRepository.existsById(id))
			produitRepository.deleteById(id);

	}

	@Override
	public List<Produit> findByTitreOrDescriptionContent(String titre, String description) {
		// TODO Auto-generated method stub
		return findByTitreOrDescriptionContent(titre, description);
	}

}
