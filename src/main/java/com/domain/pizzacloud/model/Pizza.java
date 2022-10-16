package com.domain.pizzacloud.model;

import com.domain.pizzacloud.enums.Cheese;
import com.domain.pizzacloud.enums.Sauce;
import com.domain.pizzacloud.enums.Topping;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Pizza {

    private UUID id;
    private List<Cheese> cheeseList;
    private List<Sauce> sauceList;
    private List<Topping> toppingList;

}
