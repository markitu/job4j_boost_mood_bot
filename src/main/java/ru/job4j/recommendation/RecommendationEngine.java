package ru.job4j.recommendation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class RecommendationEngine {

    @PostConstruct
    public void init() {
        System.out.println("RecommendationEngine initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("RecommendationEngine shutting down");
    }

}