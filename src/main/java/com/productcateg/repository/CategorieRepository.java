package com.productcateg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.productcateg.entity.Categorie;
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
