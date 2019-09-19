package com.productcateg.ServiceImpl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcateg.Service.PanierService;
import com.productcateg.entity.Panier;
import com.productcateg.entity.Produit;
import com.productcateg.repository.PanierRepository;
import com.productcateg.repository.ProduitRepository;
@Service
public class PanierServiceImpl implements PanierService {
	
	@Autowired
	private PanierRepository panierRepository;
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public Panier ajoutProduitToPanier(Long idPanier, Long idProduit) {
		try {
		Panier panier = panierRepository.getOne(idPanier);
		Produit produit = produitRepository.getOne(idProduit);
		Collection<Produit> listProduit = panier.getListProduit();
		listProduit.add(produit);
		panier.setListProduit(listProduit);
		return panierRepository.save(panier);
		}
		catch (Exception e) {
			return null;
		}
		
		
	}

	@Override
	public Panier enleverProduitFromPanier(Long idPanier, Long idProduit) {
		try {
		Panier panier = panierRepository.getOne(idPanier);
		Produit produit = produitRepository.getOne(idProduit);
		Collection<Produit> listProduit = panier.getListProduit();
		listProduit.remove(produit);
		panier.setListProduit(listProduit);
		return panierRepository.save(panier);
		}
		catch (Exception e) {
			return null;
		}
	}

	@Override
	public Panier viderPanier(Long idPanier) {
		try {
		Panier panier = panierRepository.getOne(idPanier);
		Collection<Produit> listProduit = panier.getListProduit();
		listProduit.clear();
		panier.setListProduit(null);
		return panierRepository.save(panier);
		}
		catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public Collection<Produit> produitDuPanier(Long idPanier) {
		try {
		return panierRepository.getOne(idPanier).getListProduit();
		}
		catch (Exception e) {
			return null;
		}
	}

}
