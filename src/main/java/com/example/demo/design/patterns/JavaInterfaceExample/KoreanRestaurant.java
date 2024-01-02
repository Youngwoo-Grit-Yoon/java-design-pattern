package com.example.demo.design.patterns.JavaInterfaceExample;

public class KoreanRestaurant implements Restaurant {
    Food food;

    @Override
    public void prepareFood() {
        food = new KoreanFood();
    }

    @Override
    public Food deliverFood() {
        return food;
    }
}
