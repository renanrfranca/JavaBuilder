package com.renan.builder;

public abstract class ChildMealBuilder {
    protected ChildMeal childMeal = new ChildMeal();

    public ChildMeal getChildMeal() {
        return childMeal;
    }

    public abstract void buildMainItem();
    public abstract void buildSideItem();
    public abstract void buildDrink();
    public abstract void buildToy();
}
