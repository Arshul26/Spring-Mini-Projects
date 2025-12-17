package com.journal.restaurantapp.service;

import com.journal.restaurantapp.entity.RestaurantEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    List<RestaurantEntry> restaurantList = new ArrayList<>();

    public RestaurantService() { // Initialize with some sample data
        restaurantList.add(createEntry("Pasta Palace", "Spaghetti Carbonara", 12.99));
        restaurantList.add(createEntry("Burger Barn", "Cheeseburger", 8.49));
        restaurantList.add(createEntry("Sushi Central", "California Roll", 10.99));
    }

    public RestaurantEntry createEntry(String name, String description, double price) { // Helper method to create a RestaurantEntry
        RestaurantEntry entry = new RestaurantEntry();
        entry.setRestaurantName(name);
        entry.setItemName(description);
        entry.setItemPrice(price);
        return entry;
    }

    public List<RestaurantEntry> getAllRestaurants() {
        return restaurantList;
    }
}
