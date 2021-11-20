package daddesh.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daddesh.demo.dao.IMarqueDao;
import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.service.IMarqueService;


@Service
public class MarqueServiceImpl implements IMarqueService{

	@Autowired
	private IMarqueDao marqueDao;
	@Override
	public List<MarqueVéhicule> getAllMarques() {
		return marqueDao.getAllMarques();
	}

	@Override
	public MarqueVéhicule addMarque(MarqueVéhicule marque) {
		return marqueDao.addMarque(marque);
	}

	@Override
	public boolean updateMarque(MarqueVéhicule marque) {
		return marqueDao.updateMarque(marque);
	}

	@Override
	public boolean deleteMarque(Long id) {
		return marqueDao.deleteMarque(id);
	}

	@Override
	public Optional<MarqueVéhicule> findById(Long id) {
		return marqueDao.findMarqueById(id);
	}

}
