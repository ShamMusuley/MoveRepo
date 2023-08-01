/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.functionalinterface.supplier;

import java.util.function.Supplier;

/**
 *
 * @author DT234016
 */
public class GetTest {

  public static void main(String[] args) {
    // This function returns a random value.
    Supplier<Double> randomValue = () -> Math.random();

    // Print the random value using get()
    System.out.println(randomValue.get());
  }
}
