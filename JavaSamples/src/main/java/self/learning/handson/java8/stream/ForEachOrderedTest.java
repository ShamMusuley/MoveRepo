/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author DT234016
 */
public class ForEachOrderedTest {

  public static void main(String[] args) {
    // Creating a Stream of Strings
    Stream<String> stream = Stream.of("GFG", "Geeks",
            "for", "GeeksforGeeks");

    // Using forEachOrdered(Consumer action) to 
    // print the elements of stream in encounter order
    stream.forEachOrdered(System.out::println);
  }
}
