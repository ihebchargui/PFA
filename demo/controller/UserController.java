package daddesh.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import daddesh.demo.dao.entity.Produit;
import daddesh.demo.dao.entity.User;
import daddesh.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    ServletContext context;
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public List<User> getUsers(){
        return  userService.getAllUsers();

    }


    @PostMapping("/regg")
    public ResponseEntity<?> saveUser(@RequestParam("user") String user, @RequestParam("file[]") MultipartFile file) throws Exception {

        User user1 = new ObjectMapper().readValue(user, User.class);
        return ResponseEntity.ok(userService.addUser(user1, file));
    }
    @GetMapping(path="/userImage/{email}")
    public byte[] getImageUser(@PathVariable("email") String email)throws Exception{
        System.out.println("miawwwwwwww"+email);
        User user = userService.findByEmaill(email);
        System.out.println("2222222miawwwwwwww"+user);
        System.out.println("3333333333333333miawwwwwwww"+user.getImage());
        return Files.readAllBytes(Paths.get(context.getRealPath("/UserImages/")+user.getImage()));

    }
    @GetMapping("/userinfo/{email}")
    public User getUser(@PathVariable("email") String email){
        System.out.println("miawwwwwwww"+email);
        return  userService.findByEmaill(email);

    }
    @PutMapping ("/update")
    public boolean updateProduit(@RequestBody User user){
        return  userService.updateUser(user);

    }
    
    
   
    @DeleteMapping("/remove")
    public boolean deleteUser(@RequestParam Long id){
        return  userService.deleteUser(id);

    }
    
    
    
    
    
    
    
    
    
}
