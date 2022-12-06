package com.masai.service;

import java.util.List;

import com.masai.Exception.ProductException;
import com.masai.model.Product;

public interface ProductService {
	
	public Product AddProduct(Product product);
	public List<Product> getAllProducts()throws ProductException;

}
