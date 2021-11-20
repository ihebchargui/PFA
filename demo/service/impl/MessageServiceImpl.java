package daddesh.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daddesh.demo.dao.IMessageDao;
import daddesh.demo.dao.entity.Message;
import daddesh.demo.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Autowired
	private IMessageDao messageDao;

	@Override
	public List<Message> getAllMessages() {
		return messageDao.getAllMessages();
	}

	@Override
	public Message addMessage(Message message) {
		return messageDao.addMessage(message);
	}

	@Override
	public boolean deleteMessage(Long id) {
		return messageDao.deleteMessage(id);
	}

	@Override
	public Optional<Message> findById(Long id) {
		return messageDao.findMessageById(id);
	}

}
