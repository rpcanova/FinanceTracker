package com.financetracker.finance_tracker_backend.repository;

import com.financetracker.finance_tracker_backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
