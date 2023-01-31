package com.app.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.raghu.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
