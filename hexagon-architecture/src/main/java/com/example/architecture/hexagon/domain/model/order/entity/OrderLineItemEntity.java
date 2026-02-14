package com.example.architecture.hexagon.domain.model.order.entity;

import com.example.architecture.hexagon.domain.model.common.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderLineItemEntity extends Entity<Long> {

    Long orderLineItemId;

    @Override
    public Long getIdentify() {
        return this.orderLineItemId;
    }
}
