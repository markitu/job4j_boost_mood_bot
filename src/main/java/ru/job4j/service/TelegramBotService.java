package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;
import ru.job4j.content.Content;

@Service
public class TelegramBotService implements BeanNameAware {
    private final BotCommandHandler handler;

    @PostConstruct
    public void init() {
        System.out.println("TelegramBotService initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("TelegramBotService shutting down");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("TelegramBotService bean name: " + name);
    }

    public TelegramBotService(BotCommandHandler handler) {
        this.handler = handler;
    }

    public void receive(Content content) {
        handler.receive(content);
    }
}