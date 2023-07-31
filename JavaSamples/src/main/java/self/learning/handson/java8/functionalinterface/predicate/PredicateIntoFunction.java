/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 *
 * @author DT234016
 */
public class PredicateIntoFunction {
  public static void main(String[] args) {
    pred(10, n -> n > 7);
  }
  
  static void pred(int number, Predicate<Integer> predicate) {
    if (predicate.test(number)) {
      System.out.println(number);
    }
  }
}
