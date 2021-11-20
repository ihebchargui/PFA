package daddesh.demo.dao;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.entity.Modele;

public interface IModeleDao {
	List<Modele> getAllModeles();
	Modele addModele (Modele modele);
    boolean updateModele (Modele modele);
    boolean deleteModele (Long id);
    Optional<Modele> findModeleById(Long id);
    List<Modele> getByMarque(MarqueVéhicule marque);

}
