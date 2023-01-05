package com.example.interview.model;

import lombok.Data;

import java.util.Set;

@Data
public class AccountResponse {
    private Account account;
    private Set<Transaction> transactions;
}
