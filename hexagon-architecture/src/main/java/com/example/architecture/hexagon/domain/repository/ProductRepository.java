package com.example.architecture.hexagon.domain.repository;

import com.example.architecture.hexagon.domain.model.products.Product;

public interface ProductRepository {
    Product save(Product product);
}
