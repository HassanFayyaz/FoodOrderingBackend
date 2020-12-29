package com.example.FoodOrderingBackend.Repository;

import com.example.FoodOrderingBackend.Model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}