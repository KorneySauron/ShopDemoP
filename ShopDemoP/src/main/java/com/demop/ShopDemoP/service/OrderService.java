package com.demop.ShopDemoP.service;

import com.demop.ShopDemoP.domain.Order;
import com.demop.ShopDemoP.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }


}