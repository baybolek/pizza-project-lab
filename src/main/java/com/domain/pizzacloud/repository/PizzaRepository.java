package com.domain.pizzacloud.repository;

import com.domain.pizzacloud.model.Pizza;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component
public class PizzaRepository {

    private static List<Pizza> pizzaList = new ArrayList<>();


    public Pizza createPizza(Pizza pizzaToSave) {
        pizzaList.add(pizzaToSave);
        return pizzaToSave;
    }

    public List<Pizza> readAll() {
        return pizzaList;
    }

}
