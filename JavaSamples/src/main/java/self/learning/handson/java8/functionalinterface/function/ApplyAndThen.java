/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.functionalinterface.function;

import java.util.function.Function;

/**
 *
 * @author DT234016
 */
public class ApplyAndThen {

  public static void main(String[] args) {
    // Function which takes in a number and
    // returns half of it
    Function<Integer, Double> half = a -> a / 2.0;

    // Now treble the output of half function
    Function<Integer, Double> composedFunction = half.andThen(a -> 3 * a);

    // Applying the function to get the result
    // and printing on console
    System.out.println(composedFunction.apply(10));
  }
}
