package com.cursoudemy.course.repositories;

import com.cursoudemy.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
