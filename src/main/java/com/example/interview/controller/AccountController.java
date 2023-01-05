package com.example.interview.controller;

import com.example.interview.model.AccountRequest;
import com.example.interview.model.AccountResponse;
import com.example.interview.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public AccountResponse accountDetailHandler(AccountRequest accountRequest){
        return null;
    }
}
