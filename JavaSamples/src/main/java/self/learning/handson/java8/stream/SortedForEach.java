/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DT234016
 */
public class SortedForEach {

  public static void main(String[] args) {

    // Creating a list of Integers
    List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

    // Using forEach(Consumer action) to
    // print the elements of stream
    // in reverse order
    list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
  }
}
