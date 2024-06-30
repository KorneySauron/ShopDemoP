package com.demop.ShopDemoP.repository;

import com.demop.ShopDemoP.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}