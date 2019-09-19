package com.productcateg.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

import com.productcateg.Service.CategorieService;
import com.productcateg.entity.Categorie;
import com.productcateg.repository.CategorieRepository;

public class CategorieServiceTest {
	
	@InjectMocks
	CategorieService categorieService;
	
	@Mock
	CategorieRepository categorieRepository;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@DisplayName("Test Methode get all categorie")
	@Test
	void testGatAllCategorie()throws ParseException {
		List<Categorie> categ = new ArrayList<Categorie>();
		Categorie c1 = new Categorie(new Long(1), "Cataegorie1");
		Categorie c2 = new Categorie(new Long(2), "Cataegorie2");
		categ.add(c1);
		categ.add(c2);
	    
	    when(categorieRepository.findAll()).thenReturn(categ);
	    
	    List<Categorie> results = categorieService.gatAllCategorie();
	    
	    assertNotNull(results);
		assertEquals(categ, results);
		assertTrue(categ.size() == results.size());
	    
	}
	
	

}
