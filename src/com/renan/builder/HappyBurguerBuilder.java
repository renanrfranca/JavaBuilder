package com.renan.builder;

public class HappyBurguerBuilder extends ChildMealBuilder {
    @Override
    public void buildMainItem() {
        this.childMeal.setMainItem("Happy Burguer");
    }

    @Override
    public void buildSideItem() {
        this.childMeal.setSideItem("Fries");
    }

    @Override
    public void buildDrink() {
        this.childMeal.setDrink("Coke");
    }

    @Override
    public void buildToy() {
        this.childMeal.setToy("Arachnid-Man");
    }
}
