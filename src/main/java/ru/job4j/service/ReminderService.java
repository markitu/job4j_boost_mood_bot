package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class ReminderService {

    @PostConstruct
    public void init() {
        System.out.println("ReminderService initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ReminderService shutting down");
    }

}