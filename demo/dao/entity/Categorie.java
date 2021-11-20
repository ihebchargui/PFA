package daddesh.demo.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import daddesh.demo.dao.entity.User.UserBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Categorie {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String nom;
	    private String image;

}
