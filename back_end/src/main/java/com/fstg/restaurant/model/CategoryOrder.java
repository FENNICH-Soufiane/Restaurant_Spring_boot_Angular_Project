package com.fstg.restaurant.model;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// cette class contient name et id
@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity {

	@Column(name = "name")
	private String name;
	
	@Column(name = "date_create")
	@CreationTimestamp
	private Date dataCreate;
	
	@Column(name = "date_update")
	@UpdateTimestamp
	private Date dataUpdate;
	
}
