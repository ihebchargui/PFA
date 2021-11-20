package daddesh.demo.dao.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import daddesh.demo.dao.IMarqueDao;
import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.repository.MarqueRepository;

@Repository
public class MarqueDaoImpl implements IMarqueDao {

	@Autowired
	private MarqueRepository marqueRepository;
	@Override
	public List<MarqueVéhicule> getAllMarques() {
		return marqueRepository.findAll();
	}

	@Override
	public MarqueVéhicule addMarque(MarqueVéhicule marque) {
		return marqueRepository.save(marque);
	}

	@Override
	public boolean updateMarque(MarqueVéhicule marque) {
		if (marqueRepository.save(marque)!=null)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteMarque(Long id) {
		if (marqueRepository.findById(id)!=null) {
			marqueRepository.deleteById(id);
			return true;
		}
		else
		return false;
	}

	@Override
	public Optional<MarqueVéhicule> findMarqueById(Long id) {
		return marqueRepository.findById(id);
	}

}
