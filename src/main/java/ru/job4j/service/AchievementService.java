package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class AchievementService implements BeanNameAware {

    @PostConstruct
    public void init() {
        System.out.println("AchievementService initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AchievementService shutting down");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("AchievementService bean name: " + name);
    }

}