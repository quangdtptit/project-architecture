package com.example.architecture.hexagon.adapter.out.persistence.order.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_line_item")
public class OrderLineItemJE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderLineItemId;
    private Long orderId;

}
