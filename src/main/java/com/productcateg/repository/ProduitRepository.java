package com.productcateg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.productcateg.entity.Produit;
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long>  {
	 public List<Produit> findByCategorieIdCategorie(Long Id);

}
