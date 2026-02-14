package com.example.architecture.hexagon.domain.model.order;

import com.example.architecture.hexagon.domain.model.common.Aggregate;
import com.example.architecture.hexagon.domain.model.order.entity.OrderEntity;
import com.example.architecture.hexagon.domain.model.order.entity.OrderLineItemEntity;

import java.util.List;

public class OrderAggregate extends Aggregate<OrderEntity> {

    private List<OrderLineItemEntity> orderLineItems;

}
