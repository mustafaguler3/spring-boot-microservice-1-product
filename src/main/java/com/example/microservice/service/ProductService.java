package com.example.microservice.service;

import com.example.microservice.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);
    void deleteProduct(Long productId);
    List<Product> findAllProducts();
}
