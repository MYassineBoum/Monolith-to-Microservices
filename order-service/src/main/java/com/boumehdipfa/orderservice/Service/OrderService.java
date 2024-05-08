package com.boumehdipfa.orderservice.Service;

import com.boumehdipfa.orderservice.DTO.ItemsTotalRequest;
import com.boumehdipfa.orderservice.DTO.OrderRequest;
import com.boumehdipfa.orderservice.DTO.OrderResponse;
import com.boumehdipfa.orderservice.Model.ItemsTotal;
import com.boumehdipfa.orderservice.Model.Order;
import com.boumehdipfa.orderservice.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {

        List<ItemsTotal> itemsTotal = orderRequest.getTotalItems()
                .stream()
                .map(this::fitItemsTotal)
                .toList();

        Order order = Order.builder()
                .totalItems(itemsTotal)
                .build();

        orderRepository.save(order);
    }

    private ItemsTotal fitItemsTotal(ItemsTotalRequest itemsTotalRequest) {
        ItemsTotal itemsTotal = ItemsTotal.builder()
                .quantity(itemsTotalRequest.getQuantity())
                .totalPrice(itemsTotalRequest.getTotalPrice())
                .build();

        return itemsTotal;
    }

    public List<OrderResponse> listOrders() {
        List<Order> orders = orderRepository.findAll();

        return orders.stream()
                .map(
                        order -> OrderResponse.builder()
                                .id(order.getId())
                                .totalItems(unfitItemsTotal(order.getTotalItems()))
                                .build()
                )
                .collect(Collectors.toList());
    }

    private List<ItemsTotalRequest> unfitItemsTotal(List<ItemsTotal> itemsTotal) {
        return itemsTotal.stream()
                .map(
                        itemTotalRequest -> ItemsTotalRequest.builder()
                                .id(itemTotalRequest.getId())
                                .totalPrice(itemTotalRequest.getTotalPrice())
                                .quantity(itemTotalRequest.getQuantity())
                                .build()
                )
                .collect(Collectors.toList());
    }
}
