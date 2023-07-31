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
public class PredicateChaining {

  public static void main(String[] args) {
    Predicate<Integer> greaterThanTen = (i) -> i > 10;

    // Creating predicate
    Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
    boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
    System.out.println(result);

    // Calling Predicate method
    boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
    System.out.println(result2);
  }
}
