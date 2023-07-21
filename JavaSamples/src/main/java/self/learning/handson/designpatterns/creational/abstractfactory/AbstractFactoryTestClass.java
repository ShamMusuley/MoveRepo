/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.abstractfactory;

/**
 *
 * @author DT234016
 */
public class AbstractFactoryTestClass {

  public static void main(String[] args) {
    //get shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory("PC", "2 GB", "500 GB", "2.4 GHz");
    Computer pc = shapeFactory.createComputer();
    System.out.println("AbstractFactory PC Config::" + pc);
    AbstractFactory shapeFactory1 = FactoryProducer.getFactory("Server", "16 GB", "1 TB", "2.9 GHz");
    Computer server = shapeFactory1.createComputer();
    System.out.println("AbstractFactory Server Config::" + server);
  }
}
