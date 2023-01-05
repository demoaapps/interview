package com.example.interview.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

@RestController
@RequestMapping("/message")
public class MessageController {
    public static final Collection<String> messages = new ConcurrentLinkedDeque<>();
}
