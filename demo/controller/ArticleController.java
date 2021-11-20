package daddesh.demo.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import daddesh.demo.service.IImageService;
import daddesh.demo.dao.entity.Images;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.dao.entity.Scategorie;
import daddesh.demo.dao.entity.Article;
import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.service.IArticleService;

@RestController
@RequestMapping("/article")
@CrossOrigin
public class ArticleController {
	
	 @Autowired
	    ServletContext context;
	    @Autowired
	    private IArticleService articleService;
	   
	   
	    
	    @GetMapping("/")
	    public List<Article> getArticles(){
	        return  articleService.getAllArticles();

	    }
	    @GetMapping("/find")
	    public Article getArticle(@RequestParam Long id){
	        return  articleService.findById(id);

	    }
	    
	   
	   @PostMapping("/add")
	    public Article addArticle(@RequestBody Article article){
	        System.out.println(article);
	        return  articleService.add(article);

	    }
	    
	    
	    
	   
	  /*  
	   @PostMapping("/add")
	    public ResponseEntity<?> saveArticle(@RequestParam("file[]") MultipartFile file,
	                                      @RequestParam("article") String article)
	            throws JsonParseException, JsonMappingException, Exception{
	        Article article1 = new ObjectMapper().readValue(article, Article.class);
	        return ResponseEntity.ok(articleService.add(article1, file));
	    }*/
	            
	   /* @GetMapping(path="/blogImage/{id}")
	    public byte[] getArticleImage(@PathVariable("id") Long id)throws Exception{

	        return articleService.getArticleImage(id);

	    }*/
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   /* @GetMapping(path="/findImage/{id}/{num}")
	    public byte[] getImageArticle(@PathVariable("id") Long id,@PathVariable("num") int num)throws Exception{
	    	Article p = articleService.findById(id);
	        List<Images> im = iImageService.getByArticle(p);

	        return Files.readAllBytes(Paths.get(context.getRealPath("/Images/")+im.get(num).getNom()));

	    }

	    @PostMapping("/add")
	    public Article addArticle(@RequestParam("file[]") MultipartFile file[],
	                              @RequestParam("article") String article)
	            throws JsonParseException, JsonMappingException, Exception
	    {
	    	Article prod = new ObjectMapper().readValue(article, Article.class);
	        boolean isExit = new File(context.getRealPath("/Images/")).exists();
	        System.out.println("mk filéé............."+file );
	        if (!isExit)
	        {
	            new File (context.getRealPath("/Images/")).mkdir();
	            System.out.println("mk dir.............");
	        }
	        articleService.add(prod);
	        for (MultipartFile fil:file
	             ) {
	            String filename = fil.getOriginalFilename();
	            String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
	            File serverFile = new File (context.getRealPath("/Images/"+File.separator+newFileName));
	            try
	            {

	                FileUtils.writeByteArrayToFile(serverFile,fil.getBytes());

	            }catch(Exception e) {
	                e.printStackTrace();
	            }
	            Images im =new Images();
	            im.setNom(newFileName);
	            im.setArticle(prod);
	            iImageService.addImages(im);

	        }






	        

	    }*/
	    @DeleteMapping("/remove")
	    public boolean deleteArticle(@RequestParam Long id){
	        return  articleService.deleteById(id);

	    }
	    @PutMapping ("/update")
	    public boolean updateArticle(@RequestBody Article article){
	        return  articleService.update(article);

	    }
	    
	    @GetMapping("/findbyScategory")
	    public List <Article> getByScategory(@RequestParam Scategorie scategorie){
	        return  articleService.getByScategory(scategorie);

	    }
	    
	    @GetMapping("/findbyModele")
	    public List <Article> getByModele(@RequestParam Modele modele){
	        return  articleService.getByModele(modele);

	    }

	}

