package com.example.architecture.hexagon.domain.port.in.order.impl;

import com.example.architecture.hexagon.domain.port.in.order.OrderUseCase;
import com.example.architecture.hexagon.domain.port.out.order.OrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderUseCaseImpl implements OrderUseCase {

    private final OrderRepository orderRepository;

}
