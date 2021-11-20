package daddesh.demo.dao.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import daddesh.demo.dao.ICategorieDao;
import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.repository.CategorieRepository;

@Repository
public class CategorieDaoImpl implements ICategorieDao {

	@Autowired
	private CategorieRepository categorieRepository;
	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie addCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public boolean updateCategorie(Categorie categorie) {

		if (categorieRepository.save(categorie)!=null)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteCategorie(Long id) {
        if (categorieRepository.findById(id) !=null){
        	categorieRepository.deleteById(id);
            return true;}
        else
            return false;
	}

	@Override
	public Optional<Categorie> findCategorieById(Long id) {
		return categorieRepository.findById(id);
	}
	

}
