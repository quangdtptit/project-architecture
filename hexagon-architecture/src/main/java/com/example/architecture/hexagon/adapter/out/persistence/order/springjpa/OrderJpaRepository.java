package com.example.architecture.hexagon.adapter.out.persistence.order.springjpa;

import com.example.architecture.hexagon.adapter.out.persistence.order.entity.OrderJE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderJE, Long> {

}
