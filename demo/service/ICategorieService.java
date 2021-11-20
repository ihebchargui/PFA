package daddesh.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.User;



public interface ICategorieService {
	List<Categorie> getAllCategories();
	Categorie addCategorie (Categorie categorie);

	/*Categorie addCategorie (Categorie categorie, MultipartFile file);*/
    boolean updateCategorie (Categorie categorie);
    boolean deleteCategorie (Long id);
    Optional<Categorie> findById(Long id);

}
