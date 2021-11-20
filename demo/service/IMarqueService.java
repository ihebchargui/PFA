package daddesh.demo.service;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.MarqueVéhicule;

public interface IMarqueService {
	List<MarqueVéhicule> getAllMarques();
	MarqueVéhicule addMarque (MarqueVéhicule marque);

	
    boolean updateMarque (MarqueVéhicule marque);
    boolean deleteMarque (Long id);
    Optional<MarqueVéhicule> findById(Long id);

}
