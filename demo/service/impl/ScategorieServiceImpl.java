package daddesh.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daddesh.demo.dao.IScategorieDao;
import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.Scategorie;
import daddesh.demo.service.IScategorieService;

@Service
public class ScategorieServiceImpl implements IScategorieService{

	
	@Autowired
	private IScategorieDao scategorieDao;
	@Override
	public List<Scategorie> getAllScategories() {
		return scategorieDao.getAllScategories();

	}

	@Override
	public Scategorie addScategorie(Scategorie scategorie) {
		return scategorieDao.addScategorie(scategorie);

	}

	@Override
	public boolean updateScategorie(Scategorie scategorie) {
		return scategorieDao.updateScategorie(scategorie);

	}

	@Override
	public boolean deleteScategorie(Long id) {
		return scategorieDao.deleteScategorie(id);

	}

	@Override
	public Optional<Scategorie> findById(Long id) {
		return scategorieDao.findScategorieById(id);

	}

	@Override
	public List<Scategorie> getByCategory(Categorie categorie) {
		return scategorieDao.getByCategory(categorie);
	}

}
