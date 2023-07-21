/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 *
 * @author DT234016
 */
public class BreakSingletonUsingReflection {

  public static void main(String[] args) {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = null;
    try {
      Constructor[] constructors
              = Singleton.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        // Below code will destroy the singleton
        // pattern
        constructor.setAccessible(true);
        instance2
                = (Singleton) constructor.newInstance();
        break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("instance1.hashCode():- "
            + instance1.hashCode());
    System.out.println("instance2.hashCode():- "
            + instance2.hashCode());
  }
}

/**
 * Overcome reflection issue: To overcome issues raised by reflection, enums are
 * used because java ensures internally that the enum value is instantiated only
 * once. Since java Enums are globally accessible, they can be used for
 * singletons. Its only drawback is that it is not flexible i.e it does not
 * allow lazy initialization. // Java program for Enum type singleton 
 * public enum Singleton { INSTANCE; }
 */
