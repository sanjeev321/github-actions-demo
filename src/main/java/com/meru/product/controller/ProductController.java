package com.meru.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.meru.product.model.Product;
import com.meru.product.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Api(value="/product",description="Product Details",produces ="application/json")
@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@ApiOperation(value="Get all Products",response=Product.class)
	@ApiResponses(value={
    		@ApiResponse(code=200,message="Product Details Retrieved",response=Product.class),
    		@ApiResponse(code=500,message="Internal Server Error"),
    		@ApiResponse(code=404,message="Product not found")
    })
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
//	@GetMapping("/products")
//	public List<Product> getRecommendedProducts(){
//		return productService.getRecommendedProducts();
//	}
	
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable long productId){
		return productService.getProduct(productId);
	}
	
	@PostMapping("/")
	public String addProduct(@RequestBody Product product){
		productService.addProduct(product);
		return "";
	}
	
	@PutMapping("/")
	public String updateProduct(@RequestBody Product product){
		productService.updateProduct(product);
		return "";
	}
	
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable long productId){
		productService.deleteProduct(productId);
	}

}
