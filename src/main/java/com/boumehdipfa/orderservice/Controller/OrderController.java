package com.boumehdipfa.orderservice.Controller;

import com.boumehdipfa.orderservice.DTO.OrderRequest;
import com.boumehdipfa.orderservice.DTO.OrderResponse;
import com.boumehdipfa.orderservice.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/place")
    public void placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
    }

    @GetMapping("/getAll")
    public List<OrderResponse> listOrders() {
        return orderService.listOrders();
    }

}
