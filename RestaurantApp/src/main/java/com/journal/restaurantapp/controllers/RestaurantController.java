package com.journal.restaurantapp.controllers;


import com.journal.restaurantapp.entity.RestaurantEntry;
import com.journal.restaurantapp.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) { // Constructor Injection
        this.restaurantService = restaurantService;
    }

    @GetMapping("/restaurants")
    public List<RestaurantEntry> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}
