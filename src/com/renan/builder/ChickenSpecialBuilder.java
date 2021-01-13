package com.renan.builder;

public class ChickenSpecialBuilder extends ChildMealBuilder {
    @Override
    public void buildMainItem() {
        childMeal.setMainItem("Chicken burguer");
    }

    @Override
    public void buildSideItem() {
        childMeal.setSideItem("Onion Rings");
    }

    @Override
    public void buildDrink() {
        childMeal.setDrink("Orange Juice");
    }

    @Override
    public void buildToy() {
        childMeal.setToy("Flying-Mammal-Man");
    }
}
