package com.productcateg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.productcateg.Service.AccountService;
import com.productcateg.entity.Categorie;
import com.productcateg.entity.Role;
import com.productcateg.repository.CategorieRepository;
import com.productcateg.repository.ProduitRepository;

@SpringBootApplication
public class ProductCatalogueApplication implements CommandLineRunner {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}
	
	@Override
	public void run(String... args)  throws Exception {
		 categorieRepository.save(new Categorie(null, "Imprimente"));
		 categorieRepository.save(new Categorie(null, "Ordinateur"));
		 categorieRepository.save(new Categorie(null, "Telephone"));
		
		     accountService.saveRole(new Role("USER"));
		     accountService.saveClient("yamen", "123");
		      accountService.addRoleToClient("yamen", "ADMIN");
		
	}
	
	@Bean
	BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

}
