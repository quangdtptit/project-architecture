package com.example.architecture.hexagon.bootstrap.configuration;

import com.example.architecture.hexagon.domain.port.in.order.OrderUseCase;
import com.example.architecture.hexagon.domain.port.in.order.impl.OrderUseCaseImpl;
import com.example.architecture.hexagon.domain.port.out.order.OrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public OrderUseCase newOrderUseCase(OrderRepository orderRepository) {
        return new OrderUseCaseImpl(orderRepository);
    }

}
