package com.renan.builder;

public class ChildMeal {
    private String mainItem = "";
    private String sideItem = "";
    private String drink = "";
    private String toy = "";

    public void setMainItem(String mainItem) {
        this.mainItem = mainItem;
    }

    public void setSideItem(String sideItem) {
        this.sideItem = sideItem;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Child meal composed of:" +
                "\nMain item: " + mainItem +
                "\nSide Item: " + sideItem +
                "\nDrink: " + drink +
                "\nToy: " + toy;
    }
}
