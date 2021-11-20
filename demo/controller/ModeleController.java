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

import daddesh.demo.dao.entity.MarqueVéhicule;
import daddesh.demo.dao.entity.Modele;
import daddesh.demo.service.IModeleService;

@RestController
@RequestMapping("/modele")
public class ModeleController {
	@Autowired
	private IModeleService modeleService;
	
	@GetMapping("/")
    public List<Modele> getModeles(){
        return  modeleService.getAllModeles();

    }
    @GetMapping("/find")
    public Optional<Modele> getModeles(@RequestParam Long id){
        return  modeleService.findById(id);

    }
    @PostMapping("/add")
    public Modele addModele(@RequestBody Modele modele){
        return  modeleService.addModele(modele);

    }
    @DeleteMapping("/remove")
    public boolean deleteModele(@RequestParam Long id){
        return  modeleService.deleteModele(id);

    }
    @PutMapping ("/update")
    public boolean updateModele(@RequestBody Modele modele){
        return  modeleService.updateModele(modele);

    }
    
    @GetMapping("/findbyMarque")
    public List <Modele> getByMarque(@RequestParam MarqueVéhicule marque){
        return  modeleService.getByMarque(marque);

    }
  

}

