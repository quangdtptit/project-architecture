package com.example.architecture.hexagon.adapter.out.persistence.order;

import com.example.architecture.hexagon.adapter.out.persistence.order.springjpa.OrderJpaRepository;
import com.example.architecture.hexagon.domain.port.out.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {

    private final OrderJpaRepository orderJpaRepository;


}
