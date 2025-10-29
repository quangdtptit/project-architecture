package com.example.architecture.hexagon.adapter.persistence.mapper;

import com.example.architecture.hexagon.adapter.persistence.products.ProductEntity;
import com.example.architecture.hexagon.domain.model.products.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {
    ProductEntity toJpaEntity(Product product);

    Product toDomain(ProductEntity jpaEntity);
}
