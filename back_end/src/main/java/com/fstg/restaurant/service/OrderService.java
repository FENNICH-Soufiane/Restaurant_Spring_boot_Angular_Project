package com.fstg.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.restaurant.dao.OrderRepository;
import com.fstg.restaurant.model.Category;
import com.fstg.restaurant.model.Order;

@Service
public class OrderService {

	private OrderRepository orderRepository;

	@Autowired
	public OrderService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}
	
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
	
}
