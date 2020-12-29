package com.example.FoodOrderingBackend.Repository;

import com.example.FoodOrderingBackend.Model.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends JpaRepository<Setting,Long> {
}