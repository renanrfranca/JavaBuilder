package com.renan.builder;

public class CounterAttendant {
    private ChildMealBuilder childMealBuilder;

    public void setChildMealBuilder(ChildMealBuilder childMealBuilder) {
        this.childMealBuilder = childMealBuilder;
    }

    public ChildMeal getChildMeal() {
        return this.childMealBuilder.getChildMeal();
    }

    public void buildChildMeal() {
        this.childMealBuilder.buildMainItem();
        this.childMealBuilder.buildSideItem();
        this.childMealBuilder.buildDrink();
        this.childMealBuilder.buildToy();
    }
}
