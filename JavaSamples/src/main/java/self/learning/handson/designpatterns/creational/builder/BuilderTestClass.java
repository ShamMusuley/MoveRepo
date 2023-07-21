/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.builder;

/**
 *
 * @author DT234016
 */
public class BuilderTestClass {

  public static void main(String[] args) {

    Meal vegMeal = new Meal.MealBuilder().addItem(new VegBurger()).addItem(new Coke()).build();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total Cost: " + vegMeal.getCost());

    Meal nonVegMeal = new Meal.MealBuilder().addItem(new ChickenBurger()).addItem(new Pepsi()).build();
    System.out.println("\n\nNon-Veg Meal");
    nonVegMeal.showItems();
    System.out.println("Total Cost: " + nonVegMeal.getCost());
  }
}
