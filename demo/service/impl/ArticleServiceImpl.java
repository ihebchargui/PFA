package daddesh.demo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import daddesh.demo.dao.IArticleDao;
import daddesh.demo.dao.entity.Article;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.entity.Scategorie;
import daddesh.demo.service.IArticleService;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import javax.servlet.ServletContext;

@Service
public class ArticleServiceImpl implements IArticleService {
	  @Autowired
	    IArticleDao iArticleDao ;
	  
	 /* @Autowired
	    ServletContext context;*/
	  
	@Override
	public List<Article> getAllArticles() {
		return iArticleDao.getAllArticles();
	}

	/*@Override
	public Article add(Article article, MultipartFile file) {
		String fileName = fileuploadImage(file);
		article.setImage(fileName);
        return iArticleDao.addArticle(article);

	}
	*/
	@Override
	public Article add(Article article) {
        return iArticleDao.addArticle(article);

	}
	
	
	
	 /*  String fileuploadImage(MultipartFile file) {
	        System.out.println("dodo2"+file);
	        boolean isExit = new File(context.getRealPath("/ArticleImages/")).exists();
	        if (!isExit)
	        {
	            new File (context.getRealPath("/ArticleImages/")).mkdir();
	            System.out.println("mk dir.............");
	        }


	        String filename = file.getOriginalFilename();
	        String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
	        File serverFile = new File (context.getRealPath("/ArticleImages/"+File.separator+newFileName));
	        try
	        {

	            FileUtils.writeByteArrayToFile(serverFile,file.getBytes());

	        }catch(Exception e) {
	            e.printStackTrace();
	        }
	        return filename;

	    }
*/

	@Override
	public boolean update(Article article) {
        return iArticleDao.updateArticle(article);

	}

	@Override
	public boolean deleteById(Long id) {
        return iArticleDao.deleteArticle(id);

	}

	@Override
	public Article findById(Long id) {
		 Optional<Article> clintOptional= iArticleDao.findById(id);
	        return  clintOptional.orElseThrow(()-> new EntityNotFoundException("Artticle Not found with id "+ id));
	}

	@Override
	public Page<Article> getAllArticles(Pageable pageable) {
        return iArticleDao.getAllArticles(pageable);

	}

	@Override
	public List<Article> getByScategory(Scategorie scategorie) {
		return iArticleDao.getByScategory(scategorie);

	}

	/*
	@Override
	public byte[] getArticleImage(Long id) throws Exception {
		Article a = iArticleDao.findById(id).orElse(null);
		return Files.readAllBytes(Paths.get(context.getRealPath("/ArticleImages/")+a.getImage()));
	}
	*/
	@Override
	public List<Article> getByModele(Modele modele) {
		return iArticleDao.getByModele(modele);

	}
 
}
