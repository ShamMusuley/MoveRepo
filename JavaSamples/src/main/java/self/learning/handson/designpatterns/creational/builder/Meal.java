/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DT234016
 */
public class Meal {
  
  private Meal(MealBuilder builder) {
    this.items = builder.items;
  }
  private List<Item> items = new ArrayList<Item>();	

   public void addItem(Item item){
      items.add(item);
   }

   public float getCost(){
      float cost = 0.0f;
      
      for (Item item : items) {
         cost += item.price();
      }		
      return cost;
   }

   public void showItems(){
   
      for (Item item : items) {
         System.out.print("Item : " + item.name());
         System.out.print(", Packing : " + item.packing().pack());
         System.out.println(", Price : " + item.price());
      }		
   }
   
  public static class MealBuilder {
  private List<Item> items = new ArrayList<Item>();	

   public MealBuilder addItem(Item item){
      items.add(item);
      return this;
   }
   
   public Meal build() {
     return new Meal(this);
   }
}
}
