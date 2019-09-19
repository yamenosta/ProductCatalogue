package com.productcateg.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcateg.Service.CategorieService;
import com.productcateg.entity.Categorie;
import com.productcateg.repository.CategorieRepository;
@Service
public class CategorieServiceImpl implements CategorieService {
	
	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public Categorie ajoutCategorie(Categorie categorie) {
		try {
		 return this.categorieRepository.save(categorie);
		}
		catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public Categorie modifCategorie(Categorie categorie) {
		try {
			 return this.categorieRepository.save(categorie);
			}
			catch (Exception e) {
				return null;
			}
	}

	@Override
	public void supprimerCategorie(Long idCategorie) {
		if (idCategorie !=null) {
			 categorieRepository.deleteById(idCategorie);
		}
			
		
			
		
	}

	@Override
	public List<Categorie> gatAllCategorie() {
		try {
		return categorieRepository.findAll();
		}
		catch (Exception e) {
			return null;
		}
	}

}
