package com.boumehdipfa.orderservice.Controller;

import com.boumehdipfa.orderservice.DTO.OrderRequest;
import com.boumehdipfa.orderservice.DTO.OrderResponse;
import com.boumehdipfa.orderservice.Service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/place")
    @CircuitBreaker(name="stock-service", fallbackMethod = "fallbackMethod")
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order placed successfully !";
    }

    @GetMapping("/getAll")
    public List<OrderResponse> listOrders() {
        return orderService.listOrders();
    }

    public String fallbackMethod(OrderRequest orderRequest, RuntimeException runtimeException) {
        return "Something went wrong while calling stock service !";
    }

}
