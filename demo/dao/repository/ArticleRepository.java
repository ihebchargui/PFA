package daddesh.demo.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import daddesh.demo.dao.entity.Article;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.entity.Scategorie;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	
    List<Article> findByScategorie(Scategorie scategorie);
    List<Article> findByModele(Modele modele);


}
