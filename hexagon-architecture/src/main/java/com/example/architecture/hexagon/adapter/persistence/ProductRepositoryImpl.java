package com.example.architecture.hexagon.adapter.persistence;

import com.example.architecture.hexagon.adapter.persistence.mapper.ProductEntityMapper;
import com.example.architecture.hexagon.adapter.persistence.products.ProductEntity;
import com.example.architecture.hexagon.adapter.repository.JpaProductRepository;
import com.example.architecture.hexagon.domain.model.products.Product;
import com.example.architecture.hexagon.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {
    private final JpaProductRepository productRepository;
    private final ProductEntityMapper productEntityMapper;
    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productEntityMapper.toJpaEntity(product);
        var savedProduct = productRepository.save(productEntity);
        return productEntityMapper.toDomain(savedProduct);
    }
}
