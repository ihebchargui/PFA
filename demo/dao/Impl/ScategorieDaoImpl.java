package daddesh.demo.dao.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import daddesh.demo.dao.IScategorieDao;
import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.Scategorie;
import daddesh.demo.dao.repository.ScategorieRepository;

@Repository
public class ScategorieDaoImpl implements IScategorieDao{

	@Autowired
	private ScategorieRepository scategorieRepository;
	
	@Override
	public List<Scategorie> getAllScategories() {
		return scategorieRepository.findAll();

	}

	@Override
	public Scategorie addScategorie(Scategorie scategorie) {
		return scategorieRepository.save(scategorie);

	}

	@Override
	public boolean updateScategorie(Scategorie scategorie) {
		if (scategorieRepository.save(scategorie)!=null)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteScategorie(Long id) {
		if (scategorieRepository.findById(id) !=null){
        	scategorieRepository.deleteById(id);
            return true;}
        else
            return false;
	}

	@Override
	public Optional<Scategorie> findScategorieById(Long id) {
		return scategorieRepository.findById(id);

	}

	@Override
	public List<Scategorie> getByCategory(Categorie categorie) {
		return scategorieRepository.findByCategorie(categorie);

	}

}
