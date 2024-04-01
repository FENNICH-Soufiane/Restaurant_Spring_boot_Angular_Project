package com.fstg.restaurant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderfood")
public class Order extends CategoryOrder {

	
	
	@Column(name = "price")
	private int price;
	@Column(name = "image")
	private String img;
	@Column(name = "description")
	private String description;
	
}
