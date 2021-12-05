package com.menus.commerce.entity;

import org.springframework.stereotype.Component;

@Component
public class OrderIdGenerator {

    public String generate() {
        return UuidGenerator.newUuid();
    }
}
