package com.productcateg.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Panier implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPanier;
	private String libellePanier;
	@OneToMany
	private Collection<Produit> listProduit;
	@OneToOne
	private Client client;
	public Long getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(Long idPanier) {
		this.idPanier = idPanier;
	}
	public String getLibellePanier() {
		return libellePanier;
	}
	public void setLibellePanier(String libellePanier) {
		this.libellePanier = libellePanier;
	}
	public Collection<Produit> getListProduit() {
		return listProduit;
	}
	public void setListProduit(Collection<Produit> listProduit) {
		this.listProduit = listProduit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
