package com.productcateg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productcateg.Service.ProduitService;
import com.productcateg.entity.Produit;
import com.productcateg.repository.ProduitRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/Produit")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@RequestMapping(value="/allProduit", method=RequestMethod.GET)
	public List<Produit> getAllProduit(){
		return produitService.getAllProduit();
	}
	
	@RequestMapping(value="/ajoutProduit", method=RequestMethod.POST)
	public Produit ajoutProduit(Produit produit, Long idCateg) {
		return produitService.ajoutProduit(produit, idCateg);
	}
	
	@RequestMapping(value="/modifProduit", method=RequestMethod.PATCH)
	public Produit updatetProduit(Produit produit) {
		return produitService.modifierProduit(produit);
	}
	
	@RequestMapping(value="/suppProduit/{idProduit}", method=RequestMethod.DELETE)
	public void deleteProduit(@PathVariable Long idProduit) {
		 produitService.suppimerProduit(idProduit);
	}
	
	@RequestMapping(value="/ProduitParCateg/{idCategorie}", method=RequestMethod.GET)
	public List<Produit> getProduitByCategorie(@PathVariable Long idCategorie){
		return produitService.getProduitByCategorie( idCategorie);
	}
	

}
