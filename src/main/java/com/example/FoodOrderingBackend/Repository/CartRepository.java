package com.example.FoodOrderingBackend.Repository;

import com.example.FoodOrderingBackend.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
}