/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.singleton;

/**
 *
 * @author DT234016
 */
public class SingletonTestClass {
  public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //Singleton object = new Singleton();

      //Get the only object available
      Singleton object1 = Singleton.getInstance();

      //show the message
      object1.showMessage();
      Singleton object2 = Singleton.getInstance();
      System.out.println("Object Equality check: " + (object1 == object2));
      System.out.println("Object Value check: " + (object1.equals(object2)));
   }
}
