package com.fstg.restaurant.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
//si le nom de la table est le meme que la class alors pas besoin de declarer @Table(name = "category")
@Entity
@Table(name = "category")
public class Category extends CategoryOrder  {
	
	@JsonIgnore//pour ignorer ce champ lors du reponse pour eviter une boucle infinie de ce champ
	@OneToMany(mappedBy = "category")
	private Set<Order> orders;

}
