package daddesh.demo.dao;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.MarqueVéhicule;

public interface IMarqueDao {
	List<MarqueVéhicule> getAllMarques();
	MarqueVéhicule addMarque (MarqueVéhicule marque);
    boolean updateMarque (MarqueVéhicule marque);
    boolean deleteMarque (Long id);
    Optional<MarqueVéhicule> findMarqueById(Long id);

}
