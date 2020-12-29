package com.example.FoodOrderingBackend.Repository;

import com.example.FoodOrderingBackend.Model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {
}