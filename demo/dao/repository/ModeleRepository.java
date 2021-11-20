package daddesh.demo.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.entity.Modele;

public interface ModeleRepository extends JpaRepository<Modele, Long> {
	List<Modele> findByMarque(MarqueVéhicule marque);

}
