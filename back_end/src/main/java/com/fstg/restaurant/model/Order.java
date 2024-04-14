package com.fstg.restaurant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends CategoryOrder {

	
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "image")
	private String img;
	
	@Column(name = "description")
	@Lob
	private String description;
	
	@JsonIgnore//pour ignorer ce champ lors du reponse pour eviter une boucle infinie de ce champ
	@ManyToOne
	@JoinColumn(name = "id_category")
	private Category category;
	
}
