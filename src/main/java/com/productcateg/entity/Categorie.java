package com.productcateg.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorie implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String nomCategorie;
	@OneToMany(mappedBy= "categorie")
	private Collection<Produit> listProduits;
	public Long getIDCategorie() {
		return idCategorie;
	}
	
	
	
	public Categorie(Long idCategorie, String nomCategorie) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		
	}



	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setIDCategorie(Long iDCategorie) {
		idCategorie = iDCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public Collection<Produit> getListProduits() {
		return listProduits;
	}
	public void setListProduits(Collection<Produit> listProduits) {
		this.listProduits = listProduits;
	}
	
	
	

}
