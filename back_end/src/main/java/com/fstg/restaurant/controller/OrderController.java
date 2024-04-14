package com.fstg.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.restaurant.model.Category;
import com.fstg.restaurant.model.Order;
import com.fstg.restaurant.service.OrderService;

@RestController
public class OrderController {

	private OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping("/api/allOrders")
	public List<Order> allOrder() {
		return orderService.getAllOrders();
	}
}
