package daddesh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import daddesh.demo.dao.entity.Categorie;
import daddesh.demo.dao.entity.Scategorie;
import daddesh.demo.service.IScategorieService;

@RestController
@RequestMapping("/scategorie")
public class ScategorieController {
	@Autowired
    private IScategorieService scategorieService;
	
	
    @GetMapping("/")
    public List<Scategorie> getScategories(){
        return  scategorieService.getAllScategories();

    }
    @GetMapping("/find")
    public Optional<Scategorie> getScategories(@RequestParam Long id){
        return  scategorieService.findById(id);

    }
    @PostMapping("/add")
    public Scategorie addScategorie(@RequestBody Scategorie scategorie){
        System.out.println(scategorie);
        return  scategorieService.addScategorie(scategorie);

    }
    @DeleteMapping("/remove")
    public boolean deleteScategorie(@RequestParam Long id){
        return  scategorieService.deleteScategorie(id);

    }
    @PutMapping ("/update")
    public boolean updateScategorie(@RequestBody Scategorie scategorie){
        return  scategorieService.updateScategorie(scategorie);

    }
    
    @GetMapping("/findbyCategory")
    public List <Scategorie> getByCategory(@RequestParam Categorie categorie){
        return  scategorieService.getByCategory(categorie);

    }
  

}

