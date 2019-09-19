package com.productcateg.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productcateg.Service.PanierService;
import com.productcateg.entity.Panier;
import com.productcateg.entity.Produit;

@CrossOrigin("*")
@RestController
@RequestMapping("/Panier")
public class PanierController {
	@Autowired
	private PanierService panierService;
	
	@RequestMapping(value="/InitPanier", method=RequestMethod.POST)
	public Panier initialiserPanier(@RequestBody Panier panier) {
		return panierService.ajoutPanier( panier);
	}
	
	@RequestMapping(value="/ProduitDuPanier/{idPanier}", method=RequestMethod.GET)
	public Collection<Produit> produitDuPanier(@PathVariable Long idPanier){
		return panierService.produitDuPanier(idPanier);
	}
	
	@RequestMapping(value="/AjoutProduitAuPanier/{idPanier}/{idProduit}", method=RequestMethod.POST)
	public Panier ajoutProduitToPanier(@PathVariable Long idPanier,@PathVariable  Long idProduit) {
		return panierService.ajoutProduitToPanier(idPanier, idProduit);
	}
	
	@RequestMapping(value="/EnleverProduitAuPanier/{idPanier}/{idProduit}", method=RequestMethod.POST)
	public Panier enleverProduitToPanier(@PathVariable Long idPanier,@PathVariable  Long idProduit) {
		return panierService.enleverProduitFromPanier(idPanier, idProduit);
	}
	
	@RequestMapping(value="/ViderPanier/{idPanier}", method=RequestMethod.POST)
	public Panier viderPanier(@PathVariable Long idPanier) {
		return panierService.viderPanier(idPanier);
	}
	
	

}
