/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.functionalinterface.predicate;

import java.util.Objects;
import java.util.function.Predicate;

/**
 *
 * @author DT234016
 */
public class AndPredicate {
  public static void main(String[] args) {
    predicateAnd();
  }
  
  static void predicateAnd() {
    Predicate<String> hasLengthOf10 = t -> t.length() > 10;
    Predicate<String> nonNullPredicate = Objects::nonNull;
    String nullString = null;
    boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
    System.out.println(outcome);

    String lengthGTThan10 = "Welcome to the machine";
    boolean outcome2 = nonNullPredicate.and(hasLengthOf10).
            test(lengthGTThan10);
    System.out.println(outcome2);
  }
}
