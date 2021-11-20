package daddesh.demo.dao.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import daddesh.demo.dao.IMessageDao;
import daddesh.demo.dao.entity.Message;
import daddesh.demo.dao.repository.MessageRepository;

@Repository
public class MessageDaoImpl implements IMessageDao {
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public List<Message> getAllMessages() {
		return messageRepository.findAll();
	}

	@Override
	public Message addMessage(Message message) {
		return messageRepository.save(message);
	}

	@Override
	public boolean deleteMessage(Long id) {
		if (messageRepository.findById(id) !=null){
			messageRepository.deleteById(id);
            return true;}
        else
            return false;
	}

	@Override
	public Optional<Message> findMessageById(Long id) {
		return messageRepository.findById(id);
	}

}
