package daddesh.demo.dao.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import daddesh.demo.dao.IArticleDao;
import daddesh.demo.dao.entity.Article;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.entity.Scategorie;
import daddesh.demo.dao.repository.ArticleRepository;

@Repository
public class ArticleDaoImpl implements IArticleDao{
	
    @Autowired
    private ArticleRepository articleRepository;

	@Override
	public List<Article> getAllArticles() {
        return articleRepository.findAll();
	}

	@Override
	public Article addArticle(Article article) {
        return articleRepository.save(article);

	}

	@Override
	public boolean updateArticle(Article article) {
	     if (articleRepository.save(article) !=null)
	            return true;
	        else
	            return false;
	    }

	@Override
	public boolean deleteArticle(Long id) {
		  if (articleRepository.existsById(id)){
			  articleRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }

	@Override
	public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);

	}

	@Override
	public Page<Article> getAllArticles(Pageable pageable) {
        return articleRepository.findAll(pageable);

	}

	@Override
	public List<Article> getByScategory(Scategorie scategorie) {
		return articleRepository.findByScategorie(scategorie);

	}
	
	@Override
	public List<Article> getByModele(Modele modele) {
		return articleRepository.findByModele(modele);

	}
	


}
