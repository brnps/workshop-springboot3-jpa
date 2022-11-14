package com.cursoudemy.course.repositories;

import com.cursoudemy.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
