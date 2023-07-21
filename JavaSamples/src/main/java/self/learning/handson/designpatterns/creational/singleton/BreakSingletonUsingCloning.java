/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.singleton;

/**
 *
 * @author DT234016
 */
public class BreakSingletonUsingCloning {
  public static void main(String[] args)
        throws CloneNotSupportedException
    {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = (Singleton)instance1.clone();
        System.out.println("instance1 hashCode:- "
                           + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                           + instance2.hashCode());
    }
}
/*
Overcome cloning issue:  you can return the same instance from the clone method.
*/
