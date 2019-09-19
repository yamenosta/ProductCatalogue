package com.productcateg.servicetest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.productcateg.Service.CategorieService;
import com.productcateg.Service.ProduitService;
import com.productcateg.entity.Categorie;
import com.productcateg.entity.Produit;
import com.productcateg.repository.CategorieRepository;
import com.productcateg.repository.ProduitRepository;

class ProduitServiceTest {
	
	@InjectMocks
    ProduitService produitService;
	
	@Mock
	ProduitRepository produitRepository;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@DisplayName("Test Methode get all produit")
	@Test
	void testGetAllProduit() {
		List<Produit> produits = new ArrayList<Produit>();
		Produit p1 = new Produit(new Long(1), "produit1");
		Produit p2 = new Produit(new Long(2), "produit2");
		produits.add(p1);
		produits.add(p2);
	    
	    when(produitRepository.findAll()).thenReturn(produits);
	    
	    List<Produit> results = produitService.getAllProduit();
	    
	    assertNotNull(results);
		assertEquals(produits, results);
		assertTrue(produits.size() == results.size());
	    
	}
	

}
