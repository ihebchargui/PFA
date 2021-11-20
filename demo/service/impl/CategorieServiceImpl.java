package daddesh.demo.service.impl;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import daddesh.demo.dao.ICategorieDao;
import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.User;
import daddesh.demo.service.ICategorieService;

@Service
public class CategorieServiceImpl implements ICategorieService {

	@Autowired
	private ICategorieDao categorieDao;
	
	 /*@Autowired
	    ServletContext context;*/
	 
	@Override
	public List<Categorie> getAllCategories() {
		return categorieDao.getAllCategories();
	}

	@Override
	public Categorie addCategorie(Categorie categorie) {
		return categorieDao.addCategorie(categorie);
	}
	
	
	
	
/*	@Override
	public Categorie addCategorie(Categorie categorie, MultipartFile file) {
		 String fileName = fileuploadImage(file) ;
	       System.out.println("dodo"+fileName);
	       Categorie newCategorie = new Categorie();
	       newCategorie.setImage(fileName);
	        newCategorie.setNom(categorie.getNom());
	       
	       
		return categorieDao.addCategorie(newCategorie);
	}
	
	
	
	
	
	
	

			String fileuploadImage(MultipartFile file) {
				System.out.println("dodo2"+file);
			      boolean isExit = new File(context.getRealPath("/CategorieImages/")).exists();
			      if (!isExit)
			      {
			          new File (context.getRealPath("/CategorieImages/")).mkdir();
			          System.out.println("mk dir.............");
			      }


			          String filename = file.getOriginalFilename();
			          String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
			          File serverFile = new File (context.getRealPath("/CategorieImages/"+File.separator+newFileName));
			          try
			          {

			              FileUtils.writeByteArrayToFile(serverFile,file.getBytes());

			          }catch(Exception e) {
			              e.printStackTrace();
			          }
				
		return filename;
	}*/

	
	

	
	@Override
	public boolean updateCategorie(Categorie categorie) {
		return categorieDao.updateCategorie(categorie);
	}

	@Override
	public boolean deleteCategorie(Long id) {
		return categorieDao.deleteCategorie(id);
	}

	@Override
	public Optional<Categorie> findById(Long id) {
		return categorieDao.findCategorieById(id);
	}

	

	

}
