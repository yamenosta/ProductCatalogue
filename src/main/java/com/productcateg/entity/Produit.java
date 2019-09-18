package com.productcateg.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit  implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String nomPrduit;
	private Double prixProduit;
	@Temporal(TemporalType.DATE)
	private Date dateExpiration;
	@Temporal(TemporalType.DATE)
	private Date dateFabrication;
	@ManyToOne
	private Categorie categorie;
	

}
