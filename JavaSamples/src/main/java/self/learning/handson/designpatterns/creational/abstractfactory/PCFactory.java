/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.abstractfactory;

/**
 *
 * @author DT234016
 */
public class PCFactory implements AbstractFactory {

  private String ram;
  private String hdd;
  private String cpu;

  public PCFactory(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }

  @Override
  public Computer createComputer() {
    return new PC(ram, hdd, cpu);
  }
}
