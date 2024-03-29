package com.productcateg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.productcateg.entity.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
	@Query("select u from Client u where u.nameClient = :x")
	public Client findByNameClient (@Param("x")String nameClient );
}
