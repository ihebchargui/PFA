package daddesh.demo.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

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
public class Article {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String nom;
	    private String codeArticle;
	    private String description;
	    private Long quantite;
	    private  String image ;

	    private double prix;
	    @ManyToOne
	    @JoinColumn(name="id_scategorie")
	    private Scategorie scategorie;
	    
	    @ManyToOne
	    @JoinColumn(name="id_modele")
	    private Modele modele;

}
