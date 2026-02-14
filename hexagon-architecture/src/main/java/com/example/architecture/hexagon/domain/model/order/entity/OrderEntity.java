package com.example.architecture.hexagon.domain.model.order.entity;

import com.example.architecture.hexagon.domain.model.common.Entity;
import com.example.architecture.hexagon.domain.model.order.vo.AddressVO;
import com.example.architecture.hexagon.domain.model.order.vo.MoneyVO;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderEntity extends Entity<Long> {

    Long orderId;
    String orderCode;
    LocalDateTime orderDate;
    AddressVO shippingAddress;
    MoneyVO subtotal;

    @Override
    public Long getIdentify() {
        return this.orderId;
    }

}
