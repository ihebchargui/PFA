package daddesh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import daddesh.demo.dao.entity.Message;
import daddesh.demo.service.IMessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
	@Autowired
	   private IMessageService messageService;

	    @GetMapping("/")
	    public List<Message> getMessages(){
	        return  messageService.getAllMessages();

	    }
	    @GetMapping("/find")
	    public Optional<Message> getMessages(@RequestParam Long id){
	        return  messageService.findById(id);

	    }
	    @PostMapping("/add")
	    public Message addMessage(@RequestBody Message message){
	        return  messageService.addMessage(message);

	    }
	    
	    
	    @DeleteMapping("/remove")
	    public boolean deleteMessage(@RequestParam Long id){
	        return  messageService.deleteMessage(id);

	    }
	    
	  

	}

