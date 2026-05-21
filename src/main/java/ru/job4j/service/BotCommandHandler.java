package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;
import ru.job4j.content.Content;

@Service
public class BotCommandHandler implements BeanNameAware {

    @PostConstruct
    public void init() {
        System.out.println("BotCommandHandler initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BotCommandHandler shutting down");
    }

    void receive(Content content) {
        System.out.println(content);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BotCommandHandler bean name: " + name);
    }
}