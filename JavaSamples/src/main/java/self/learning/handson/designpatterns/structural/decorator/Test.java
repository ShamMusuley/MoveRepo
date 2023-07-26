/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.structural.decorator;

/**
 *
 * @author DT234016
 */
public class Test {

  public static void main(String[] args) {
    IceCream simpleIceCream = new SimpleIceCream();
    System.out.println(simpleIceCream.makeIceCream());
    IceCream nuttyIceCream = new NuttyDecorator(simpleIceCream);
    System.out.println(nuttyIceCream.makeIceCream());
    IceCream nuttyHoneyIceCream = new HoneyDecorator(nuttyIceCream);
    System.out.println(nuttyHoneyIceCream.makeIceCream());
  }
}
