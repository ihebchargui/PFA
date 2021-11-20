package daddesh.demo.dao;

import java.util.List;
import java.util.Optional;


import daddesh.demo.dao.entity.Categorie;

public interface ICategorieDao {
	 	List<Categorie> getAllCategories();
	    Categorie addCategorie (Categorie categorie);
	    boolean updateCategorie (Categorie categorie);
	    boolean deleteCategorie (Long id);
	    Optional<Categorie> findCategorieById(Long id);
	}


