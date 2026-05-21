package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class ReminderService implements BeanNameAware {

    @PostConstruct
    public void init() {
        System.out.println("ReminderService initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ReminderService shutting down");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("ReminderService bean name: " + name);
    }

}