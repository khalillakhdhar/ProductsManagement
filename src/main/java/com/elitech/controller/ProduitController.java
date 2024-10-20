package com.elitech.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.entity.Produit;
import com.elitech.services.ProduitServiceInterface;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("produits")
@RequiredArgsConstructor
public class ProduitController {
	private ProduitServiceInterface serviceInterface;
	
	@GetMapping
	public List<Produit> getAllProduits()
	{
		return serviceInterface.getAllProduits();
	}
	@PostMapping
	public Produit addOne(@RequestBody Produit produit)
	{
		return serviceInterface.addOneProduit(produit);
	}
	@GetMapping("/{id}")
	public Produit getOneProduit(@PathVariable long id)
	{
		return serviceInterface.findOneProduit(id);
	}
	@GetMapping("/search")
	public List<Produit> searchProduit(@RequestParam(required = false) String titre, @RequestParam(required = false) String description)
	{
		if(!titre.equals(null)&& description.equals(null))
			return serviceInterface.findByTitre(titre);
		else if(titre.equals(null)&& !description.equals(null))
			return serviceInterface.findByDescriptionContent(description);
		else if(!titre.equals(null)&&!description.equals(null))
			return serviceInterface.findByTitreOrDescriptionContent(titre, description);
			
			return serviceInterface.getAllProduits();
	}
	

}
