package daddesh.demo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import daddesh.demo.dao.entity.MarqueVéhicule;

public interface MarqueRepository extends JpaRepository<MarqueVéhicule, Long> {

}
