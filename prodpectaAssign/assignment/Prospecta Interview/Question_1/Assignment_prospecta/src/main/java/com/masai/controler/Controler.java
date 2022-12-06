package com.masai.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.service.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/service")
public class Controler {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/product")
	public ResponseEntity<Product> Addproduct(@RequestBody Product product){
		
		  return new ResponseEntity<Product>(productservice.AddProduct(product), HttpStatus.CREATED);
	}
	
	 @GetMapping("/products")
	  public ResponseEntity<List<Product>> getAllProduct(){
		  
		      List<Product>  products=  productservice.getAllProducts();
		      
		      return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	  }
	

}
