package com.renan.builder;

public class HappyBurguerBuilder extends ChildMealBuilder {
    @Override
    public void buildMainItem() {
        childMeal.setMainItem("Happy Burguer");
    }

    @Override
    public void buildSideItem() {
        childMeal.setSideItem("Fries");
    }

    @Override
    public void buildDrink() {
        childMeal.setDrink("Coke");
    }

    @Override
    public void buildToy() {
        childMeal.setToy("Arachnid-Man");
    }
}
