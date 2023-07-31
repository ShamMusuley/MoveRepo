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
public class OrPredicate {
  public static void main(String[] args) {
    predicateOr();
  }
  
  static void predicateOr() {
    Predicate<String> hasLengthOf10 = t -> t.length() > 10;
    Predicate<String> containsLetterA = p -> p.contains("A");
    String containsA = "And";
    boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
    System.out.println(outcome);
  }
}
