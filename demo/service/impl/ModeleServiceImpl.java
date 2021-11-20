package daddesh.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daddesh.demo.dao.IModeleDao;
import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.service.IModeleService;

@Service
public class ModeleServiceImpl implements IModeleService {
	@Autowired
	private IModeleDao modeleDao;

	@Override
	public List<Modele> getAllModeles() {
		return modeleDao.getAllModeles();
	}

	@Override
	public Modele addModele(Modele modele) {
		return modeleDao.addModele(modele);
	}

	@Override
	public boolean updateModele(Modele modele) {
		return modeleDao.updateModele(modele);
	}

	@Override
	public boolean deleteModele(Long id) {
		return modeleDao.deleteModele(id);
	}

	@Override
	public Optional<Modele> findById(Long id) {
		return modeleDao.findModeleById(id);
	}

	@Override
	public List<Modele> getByMarque(MarqueVéhicule marque) {
		return modeleDao.getByMarque(marque);
	}

}
