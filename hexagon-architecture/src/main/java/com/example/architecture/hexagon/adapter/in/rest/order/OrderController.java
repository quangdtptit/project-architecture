package com.example.architecture.hexagon.adapter.in.rest.order;

import com.example.architecture.hexagon.adapter.in.rest.order.req.OrderReq;
import com.example.architecture.hexagon.adapter.in.rest.order.resp.OrderResp;
import com.example.architecture.hexagon.domain.port.in.order.OrderUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderUseCase orderUseCase;

    @PostMapping
    public OrderResp create(@RequestBody @Valid OrderReq orderReq) {
        return null;
    }
}
