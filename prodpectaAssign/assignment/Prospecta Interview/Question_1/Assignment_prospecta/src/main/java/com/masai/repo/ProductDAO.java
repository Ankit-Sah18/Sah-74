package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {

}
