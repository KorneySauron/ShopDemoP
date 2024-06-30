package com.demop.ShopDemoP.repository;

import com.demop.ShopDemoP.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}