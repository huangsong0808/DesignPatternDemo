package com.designpatterndemo.chenxkang.patterns.builder;

/**
 * author: chenxkang
 * time  : 17/4/17
 * desc  : C套餐的具体建造者
 */

public class CMealBuilder implements IMealBuilder {

    private Meal meal;

    public CMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildChickenBurger() {
        meal.addFood(new SuperChickenBurger());
    }

    @Override
    public void buildFrenchFries() {
        meal.addFood(new ScrewFrenchFries());
    }

    @Override
    public void buildBeverage() {
        meal.addFood(new CocaColaBeverage());
    }

    @Override
    public Meal createMeal() {
        return meal;
    }
}
