package com.productcateg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ch.qos.logback.core.net.server.Client;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

}
