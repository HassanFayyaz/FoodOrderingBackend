package com.example.FoodOrderingBackend.Repository;

import com.example.FoodOrderingBackend.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}