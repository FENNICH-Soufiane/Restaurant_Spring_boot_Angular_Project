package com.fstg.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// cette class contient name et id
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryOrder extends BaseEntity {

	private String name;
}
