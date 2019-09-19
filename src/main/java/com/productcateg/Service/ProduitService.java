package com.productcateg.Service;

import java.util.List;

import com.productcateg.entity.Produit;

public interface ProduitService {
	
	public Produit ajoutProduit(Produit produit, Long idCategorie);
	public Produit modifierProduit(Produit produit);
	public void suppimerProduit(Long idProduit);
	public List<Produit> getProduitByCategorie(Long idCategorie);
	public List<Produit> getAllProduit();
	

}
