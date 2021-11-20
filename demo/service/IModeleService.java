package daddesh.demo.service;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.entity.Modele;

public interface IModeleService {
	List<Modele> getAllModeles();
	Modele addModele (Modele modele);
    boolean updateModele (Modele modele);
    boolean deleteModele (Long id);
    Optional<Modele> findById(Long id);
    List<Modele> getByMarque(MarqueVéhicule marque);

}
