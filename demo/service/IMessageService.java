package daddesh.demo.service;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.Message;

public interface IMessageService {
	List<Message> getAllMessages();
	Message addMessage (Message message);
    boolean deleteMessage (Long id);
    Optional<Message> findById(Long id);


}
