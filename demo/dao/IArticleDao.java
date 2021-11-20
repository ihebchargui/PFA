package daddesh.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import daddesh.demo.dao.entity.Article;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.entity.Scategorie;

public interface IArticleDao {
	 List<Article> getAllArticles();
	 Article addArticle (Article article);
	    boolean updateArticle (Article article);
	    boolean deleteArticle (Long id);
	    Optional<Article> findById(Long id);
	    Page<Article> getAllArticles(Pageable pageable);
	    List<Article> getByScategory(Scategorie scategorie);
	    List<Article> getByModele(Modele modele);
}

