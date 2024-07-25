package com.financetracker.finance_tracker_backend.controller;

import com.financetracker.finance_tracker_backend.exception.TransactionNotFoundException;
import com.financetracker.finance_tracker_backend.model.Transaction;
import com.financetracker.finance_tracker_backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/api/transaction")
    Transaction newTransaction(@RequestBody Transaction newTransaction){
        newTransaction.setDate(LocalDateTime.now());
        return transactionRepository.save(newTransaction);
    }

    @GetMapping("/api/transactions")
    List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }

    @GetMapping("api/transaction/{id}")
    Transaction getTransactionById(@PathVariable Long id){
        return transactionRepository.findById(id).orElseThrow(() -> new TransactionNotFoundException(id));
    }

    @PutMapping("/transaction/{id}")
    Transaction updateTransaction(@RequestBody Transaction newTransaction, @PathVariable Long id){
        return transactionRepository.findById(id).map(transaction -> {
            transaction.setAmount(newTransaction.getAmount());
            transaction.setCategory(newTransaction.getCategory());
            transaction.setDate(newTransaction.getDate());
            transaction.setDescription(newTransaction.getDescription());
            transaction.setType(newTransaction.getType());

            return transactionRepository.save(transaction);
        }).orElseThrow(() -> new TransactionNotFoundException(id));
    }

    @DeleteMapping("/transaction/{id}")
    String deleteTransaction(@PathVariable Long id){
        if(!transactionRepository.existsById(id)){
            throw new TransactionNotFoundException(id);
        }

        transactionRepository.deleteById(id);

        return "Transaction with id " + id + " deleted successfully";
    }
}
