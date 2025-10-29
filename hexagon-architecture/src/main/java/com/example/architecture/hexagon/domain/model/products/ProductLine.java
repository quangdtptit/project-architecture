package com.example.architecture.hexagon.domain.model.products;

import com.example.architecture.hexagon.domain.common.base.Root;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductLine extends Root<Long> {
    private String name;
}
