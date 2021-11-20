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
import daddesh.demo.service.IMarqueService;

@RestController
@RequestMapping("/marque")
public class MarqueController {
	@Autowired
	private IMarqueService marqueService;
	
	 @GetMapping("/")
	    public List<MarqueVéhicule> getMarques(){
	        return  marqueService.getAllMarques();

	    }
	    @GetMapping("/find")
	    public Optional<MarqueVéhicule> getMarques(@RequestParam Long id){
	        return  marqueService.findById(id);

	    }
	    @PostMapping("/add")
	    public MarqueVéhicule addMarque(@RequestBody MarqueVéhicule marque){
	        return  marqueService.addMarque(marque);

	    }
	    
	    
	    
	    @DeleteMapping("/remove")
	    public boolean deleteMarque(@RequestParam Long id){
	        return  marqueService.deleteMarque(id);

	    }
	    @PutMapping ("/update")
	    public boolean updateMarque(@RequestBody MarqueVéhicule marque){
	        return  marqueService.updateMarque(marque);

	    }

}
