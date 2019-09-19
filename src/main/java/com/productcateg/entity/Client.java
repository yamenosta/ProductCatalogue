package com.productcateg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nameClient;
	@JsonProperty(access=Access.WRITE_ONLY)
	private String password;
	@ManyToMany (fetch=FetchType.EAGER)
	private Collection<Role> roles= new ArrayList<>();
	
	
	
	

}
