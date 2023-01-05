package com.example.interview.controller;

import com.example.interview.model.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @GetMapping
    public List<Transaction> handleTransactionList(String accountNumber) {
        return Collections.emptyList();
    }
}
