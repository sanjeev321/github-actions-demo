package com.meru.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meru.product.dao.ProductRepository;
import com.meru.product.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}
	
//	public List<Product> getRecommendedProducts(){
//		TypedQuery<Product> query = sessionFactory.getCurrentSession().createQuery("from Product ");
//		return query.getResultList();
//	}
	
	public Product getProduct(long productId){
		return productRepository.findById(productId).orElse(null);
	}
	
	public void addProduct(Product product){
		productRepository.save(product);
	}
	
	public void updateProduct(Product product){
		productRepository.save(product);
	}
	
	public void deleteProduct(long productId){
		productRepository.deleteById(productId);
	}

}
