package com.example.architecture.hexagon.adapter.controller;

import com.example.architecture.hexagon.app.service.ProductService;
import com.example.architecture.hexagon.domain.model.products.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/public/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        log.info("save product: {}", product);
        var response = productService.save(product);
        return ResponseEntity.ok(response);
    }
}
