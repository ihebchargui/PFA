package daddesh.demo.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.Scategorie;

public interface ScategorieRepository extends JpaRepository<Scategorie, Long>{

    List<Scategorie> findByCategorie(Categorie categorie);

}
