package com.example.architecture.hexagon.app.service;

import com.example.architecture.hexagon.adapter.persistence.ProductRepositoryImpl;
import com.example.architecture.hexagon.domain.model.products.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepositoryImpl productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }
}
