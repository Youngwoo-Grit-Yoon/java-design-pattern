package com.example.demo.design.patterns.JavaInterfaceExample;

public class JapaneseRestaurant implements Restaurant {
    Food food;

    @Override
    public void prepareFood() {
        food = new JapaneseFood();
    }

    @Override
    public Food deliverFood() {
        return food;
    }
}
