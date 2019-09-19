package com.productcateg.Service;

import java.util.List;

import com.productcateg.entity.Categorie;

public interface CategorieService {
	
	public Categorie ajoutCategorie(Categorie categorie);
	public Categorie modifCategorie(Categorie categorie);
	public void supprimerCategorie(Long idCategorie);
	public List<Categorie> gatAllCategorie();
	
}
