package daddesh.demo.service;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.Scategorie;

public interface IScategorieService {
	List<Scategorie> getAllScategories();
	Scategorie addScategorie (Scategorie scategorie);
    boolean updateScategorie (Scategorie scategorie);
    boolean deleteScategorie (Long id);
    Optional<Scategorie> findById(Long id);
    List<Scategorie> getByCategory(Categorie categorie);
}