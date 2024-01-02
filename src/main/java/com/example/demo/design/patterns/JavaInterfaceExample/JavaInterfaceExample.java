package com.example.demo.design.patterns.JavaInterfaceExample;

import com.example.demo.design.patterns.DesignPattern;

public class JavaInterfaceExample implements DesignPattern {
    @Override
    public void run() {
        String whereToGo = "JapaneseRestaurant";
        Restaurant restaurant;

        switch (whereToGo) {
            case "KoreanRestaurant" -> restaurant = new KoreanRestaurant();
            case "JapaneseRestaurant" -> restaurant = new JapaneseRestaurant();
            default -> {
                return;
            }
        }

        restaurant.prepareFood();
        Food food = restaurant.deliverFood();
    }
}
