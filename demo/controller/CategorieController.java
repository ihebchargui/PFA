package daddesh.demo.controller;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.fasterxml.jackson.databind.ObjectMapper;

import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.User;
import daddesh.demo.service.ICategorieService;
import daddesh.demo.service.IComandeService;

@RestController
@RequestMapping("/categorie")

public class CategorieController {
	@Autowired
   private ICategorieService categorieService;
	
	/*@Autowired
    ServletContext context;*/
	
    @GetMapping("/")
    public List<Categorie> getCategories(){
        return  categorieService.getAllCategories();

    }
    @GetMapping("/find")
    public Optional<Categorie> getCategories(@RequestParam Long id){
        return  categorieService.findById(id);

    }
    @PostMapping("/add")
    public Categorie addCategorie(@RequestBody Categorie categorie){
        System.out.println(categorie);
        return  categorieService.addCategorie(categorie);

    }
    
    
    

  /*  @PostMapping("/add")
    public ResponseEntity<?> saveCategorie(@RequestParam("categorie") String categorie, @RequestParam("file[]") MultipartFile file) throws Exception {

        Categorie categorie1 = new ObjectMapper().readValue(categorie, Categorie.class);
        return ResponseEntity.ok(categorieService.addCategorie(categorie1, file));
    }
    */
    
    
    
  
    
    
    
    
   /* @GetMapping(path="/categorieImage/{id}")
    public byte[] getImageUser(@PathVariable("id") Long id)throws Exception{
        
        Categorie categorie = categorieService.findById(id);
       
        return Files.readAllBytes(Paths.get(context.getRealPath("/CategorieImages/")+categorie.getImage()));

    }*/
    
    
    
    
    
    
    
    
    
    
    @DeleteMapping("/remove")
    public boolean deleteCategorie(@RequestParam Long id){
        return  categorieService.deleteCategorie(id);

    }
    @PutMapping ("/update")
    public boolean updateCategorie(@RequestBody Categorie categorie){
        return  categorieService.updateCategorie(categorie);

    }
  

}

