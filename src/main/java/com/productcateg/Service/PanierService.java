package com.productcateg.Service;

import java.util.Collection;
import java.util.List;

import com.productcateg.entity.Panier;
import com.productcateg.entity.Produit;

public interface PanierService {
	
	public Panier ajoutProduitToPanier(Long idPanier, Long idProduit);
	public Panier enleverProduitFromPanier(Long idPanier, Long idProduit);
	public Panier viderPanier(Long idPanier);
	public Collection<Produit> produitDuPanier(Long idPanier);

}
