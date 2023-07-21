/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 *
 * @author DT234016
 */
public class Singleton implements Serializable, Cloneable {

  //create an object of Singleton
  private static Singleton instance = null;

  //make the constructor private so that this class cannot be
  //instantiated
  private Singleton() {
  }

  //Get the only object available
  public static Singleton getInstance() {
    if (instance == null) {
      //synchronized block to make it thread safe.
      synchronized (Singleton.class) {
        if (instance == null) {
          // if instance is null, initialize
          instance = new Singleton();
        }
      }
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("Hello World!");
  }

// implement readResolve method to prevent breaking Singleton class through Serialization.
//  protected Object readResolve() {
//    return instance;
//  }.
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return instance;
  }
}
