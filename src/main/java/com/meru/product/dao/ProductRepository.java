package com.meru.product.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meru.product.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
