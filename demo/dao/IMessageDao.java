package daddesh.demo.dao;

import java.util.List;
import java.util.Optional;

import daddesh.demo.dao.entity.Message;

public interface IMessageDao {

	List<Message> getAllMessages();
	Message addMessage (Message message);
    boolean deleteMessage (Long id);
    Optional<Message> findMessageById(Long id);
}
