package daddesh.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import daddesh.demo.dao.entity.Article;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.entity.Scategorie;

public interface IArticleService {
	   List<Article> getAllArticles();
	  /* Article add (Article article, MultipartFile file);*/
	   Article add (Article article);

	    boolean update (Article article);
	    boolean deleteById (Long id);
	    Article findById(Long id);
	    Page<Article> getAllArticles(Pageable pageable);
	    List<Article> getByScategory(Scategorie scategorie);
	  /*  public byte[] getArticleImage(Long id) throws Exception;*/
	    List<Article> getByModele(Modele modele);

}
