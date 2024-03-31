package com.fstg.restaurant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Data
//si le nom de la table est le meme que la class alors pas besoin de declarer @Table(name = "category")
@Entity
@Table(name = "category")
public class Category extends CategoryOrder  {
	
		

}
