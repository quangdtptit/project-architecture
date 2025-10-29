package com.example.architecture.hexagon.adapter.repository;

import com.example.architecture.hexagon.adapter.persistence.products.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long> {
}
