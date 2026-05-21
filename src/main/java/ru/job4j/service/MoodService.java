package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class MoodService {

    @PostConstruct
    public void init() {
        System.out.println("MoodService initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("MoodService shutting down");
    }

}