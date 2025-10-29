package com.example.architecture.hexagon.domain.model.products;

import com.example.architecture.hexagon.domain.common.base.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Product extends Entity<Long> {
    private String name;
}
