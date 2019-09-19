package com.productcateg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productcateg.Service.CategorieService;
import com.productcateg.entity.Categorie;

@CrossOrigin("*")
@RestController
@RequestMapping("/Categorie")
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;
	
	@RequestMapping(value="/allCategorie", method=RequestMethod.GET)
	public List<Categorie> getAllCategorie() {
	 return categorieService.gatAllCategorie();
	}
	
	@RequestMapping(value="/ajoutCategorie", method=RequestMethod.POST)
	public Categorie addCategorie(@RequestBody Categorie categ) {
		return categorieService.ajoutCategorie(categ);
	}
	
	@RequestMapping(value="/modifCategorie", method=RequestMethod.PUT)
	public Categorie updateCategorie(@RequestBody Categorie categ) {
		return categorieService.modifCategorie(categ);
	}
	
	@RequestMapping(value="/supprimCategorie/{idCateg}", method=RequestMethod.DELETE)
	public void deleteCategorie(@PathVariable Long idCateg) {
		 categorieService.supprimerCategorie(idCateg);
	}

}
