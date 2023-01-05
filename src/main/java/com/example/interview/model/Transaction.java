package com.example.interview.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Transaction {
    private LocalDateTime dateTime;
    private Double amount;
}
