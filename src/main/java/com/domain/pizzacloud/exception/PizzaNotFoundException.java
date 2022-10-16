package com.domain.pizzacloud.exception;

public class PizzaNotFoundException extends RuntimeException {
    public PizzaNotFoundException(String message) {
        super(message);
    }
}
