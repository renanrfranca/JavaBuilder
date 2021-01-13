package com.renan.builder;

public class Main {

    private static final String promptMessage = "Informe o número da refeição desejada:\n" +
            "1) Happy meal\n" +
            "2) Chicken Special";

    public static void main(String[] args) {
        try {
            validateInput(args);
        } catch (Exception e) {
            System.out.println(promptMessage);
            return;
        }

        int mealCode = Integer.parseInt(args[0]);
        CounterAttendant attendant = new CounterAttendant();
        ChildMeal childMeal;

        if (mealCode == 1) {
            attendant.setChildMealBuilder(new MerryMealBuilder());
        } else {
            attendant.setChildMealBuilder(new ChickenSpecialBuilder());
        }

        attendant.buildChildMeal();
        childMeal = attendant.getChildMeal();

        System.out.println(childMeal);
    }

    public static void validateInput(String[] args) throws Exception {
        int mealCode;

        if (args.length == 1) {
             mealCode = Integer.parseInt(args[0]);
             if (mealCode > 0 && mealCode <= 2) {
                 return;
             }
        }

        throw new Exception("Código de refeição inválido");
    }
}
