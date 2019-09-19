package com.productcateg.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcateg.Service.ProduitService;
import com.productcateg.entity.Categorie;
import com.productcateg.entity.Produit;
import com.productcateg.repository.CategorieRepository;
import com.productcateg.repository.ProduitRepository;
@Service
public class ProduiServiceImpl implements ProduitService {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public Produit ajoutProduit(Produit produit, Long idCategorie) {
		try {
		Categorie categorie = categorieRepository.getOne(idCategorie);
	    produit.setCategorie(categorie);
	      return produitRepository.save(produit);
		} catch (Exception e) {
			return null;
		}
		
		
	}

	@Override
	public Produit modifierProduit(Produit produit) {
		try {
			
		      return produitRepository.save(produit);
			} catch (Exception e) {
				return null;
			}
	}

	@Override
	public void suppimerProduit(Long idProduit) {
		if (idProduit != null) {
			produitRepository.deleteById(idProduit);
		}
		
	}

	@Override
	public List<Produit> getProduitByCategorie(Long idCategorie) {
		try {
		return produitRepository.findByCategorieIdCategorie(idCategorie);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Produit> getAllProduit() {
		try {
		return produitRepository.findAll();
	} catch (Exception e) {
		return null;
	}
	}


}
