package com.productcateg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.productcateg.entity.Panier;
@RepositoryRestResource
public interface PanierRepository extends JpaRepository<Panier, Long> {

}
