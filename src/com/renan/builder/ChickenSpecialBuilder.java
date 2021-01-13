package com.renan.builder;

public class ChickenSpecialBuilder extends ChildMealBuilder {
    @Override
    public void buildMainItem() {
        this.childMeal.setMainItem("Chicken burguer");
    }

    @Override
    public void buildSideItem() {
        this.childMeal.setSideItem("Onion Rings");
    }

    @Override
    public void buildDrink() {
        this.childMeal.setDrink("Orange Juice");
    }

    @Override
    public void buildToy() {
        this.childMeal.setToy("Flying-Mammal-Man");
    }
}
