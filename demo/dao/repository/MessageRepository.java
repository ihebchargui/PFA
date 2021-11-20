package daddesh.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import daddesh.demo.dao.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
