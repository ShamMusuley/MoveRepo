/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import self.learning.handson.pojo.Item;

/**
 *
 * @author Dell
 */
public class StreamIntermediateOperationsDemo {

    public static void main(String[] args) {
        //Simulate a shopping cart with items
        List<Item> shoppingCart = List.of(
                new Item("Laptop", 1000.00),
                new Item("Phone", 500.00),
                new Item("Tablet", 800.00),
                new Item("HeadPhones", 100.00),
                new Item("Keyboard", 50.00)
        );

        //Intermediate operations using 
        List<String> selectedItems = shoppingCart.stream().filter(item -> item.getPrice() > 100.00)
                .map(Item::getName)
                .distinct()
                .sorted()
                .skip(1)
                .limit(2).collect(Collectors.toList());
        System.out.println("\n Intermediate Operations Result");
        selectedItems.forEach(System.out::println);
    }
}
