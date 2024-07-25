package com.financetracker.finance_tracker_backend.exception;

public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(Long id){
        super("Transaction with id " + id + " not found");
    }
}
