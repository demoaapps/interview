package com.example.interview.service;

import com.example.interview.model.Account;
import com.example.interview.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AccountService {

    public List<Transaction> findTransactions(String accountNumber){
        return Collections.emptyList();
    }

    public Account findAccount(String accountNumber) {
        return null;
    }
}
