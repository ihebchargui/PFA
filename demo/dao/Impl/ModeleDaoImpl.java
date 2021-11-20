package daddesh.demo.dao.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import daddesh.demo.dao.IModeleDao;
import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.repository.ModeleRepository;

@Repository
public class ModeleDaoImpl implements IModeleDao{
	@Autowired
	private ModeleRepository modeleRepository;

	@Override
	public List<Modele> getAllModeles() {
		return modeleRepository.findAll();
	}

	@Override
	public Modele addModele(Modele modele) {
		return modeleRepository.save(modele);
	}

	@Override
	public boolean updateModele(Modele modele) {
		if (modeleRepository.save(modele)!= null)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteModele(Long id) {
		if (modeleRepository.findById(id) !=null){
			modeleRepository.deleteById(id);
            return true;}
        else
            return false;
	}

	@Override
	public Optional<Modele> findModeleById(Long id) {
		return modeleRepository.findById(id);
	}

	@Override
	public List<Modele> getByMarque(MarqueVéhicule marque) {
		return modeleRepository.findByMarque(marque);
	}

}
