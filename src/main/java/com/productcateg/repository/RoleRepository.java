package com.productcateg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.productcateg.entity.Role;
@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Long>  {
	
	@Query("select r from Role r where r.roleName = :x")
	public Role findByRoleName (@Param("x")String roleName);

}
