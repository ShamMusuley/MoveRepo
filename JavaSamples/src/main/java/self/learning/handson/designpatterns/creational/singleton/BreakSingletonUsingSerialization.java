/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author DT234016
 */
public class BreakSingletonUsingSerialization {

  public static void main(String[] args) {
    ObjectOutput out = null;
    ObjectInput in = null;
    try {
      Singleton instance1 = Singleton.getInstance();
      out = new ObjectOutputStream(new FileOutputStream("file.text"));

      out.writeObject(instance1);
      // deserialize from file to object
      in = new ObjectInputStream(new FileInputStream("file.text"));
      Singleton instance2 = (Singleton) in.readObject();
      System.out.println("instance1 hashCode:- "
              + instance1.hashCode());
      System.out.println("instance2 hashCode:- "
              + instance2.hashCode());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (out != null) {
        try {
          out.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
      if (in != null) {
        try {
          in.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
    }
  }
}
/*
Overcome serialization issue:- To overcome this issue, we have to implement the method readResolve() method. 
 */
