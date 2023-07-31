/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.functionalinterface.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author DT234016
 */
public class AcceptAndThen {
  public static void main(String[] args) {
    // Consumer to multiply 2 to every integer of a list
    Consumer<List<Integer>> modify = list
            -> {
      for (int i = 0; i < list.size(); i++) {
        list.set(i, 2 * list.get(i));
      }
    };
    // Consumer to display a list of integers
    Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

    List<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(1);
    list.add(3);

    // using addThen()
    modify.andThen(dispList).accept(list);
  }
}
