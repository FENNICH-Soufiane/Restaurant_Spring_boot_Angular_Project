package com.fstg.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.restaurant.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
