package com.example.architecture.hexagon.adapter.repository;

import com.example.architecture.hexagon.domain.model.products.ProductLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductLineRepository extends JpaRepository<ProductLine, Long> {
}
