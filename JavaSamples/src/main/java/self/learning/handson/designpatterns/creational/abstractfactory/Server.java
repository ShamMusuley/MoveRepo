/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.abstractfactory;

/**
 *
 * @author DT234016
 */
public class Server implements Computer {

  private String ram;
  private String hdd;
  private String cpu;

  public Server(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }

  @Override
  public String getRAM() {
    return this.ram;
  }

  @Override
  public String getHDD() {
    return this.hdd;
  }

  @Override
  public String getCPU() {
    return this.cpu;
  }

  @Override
  public String toString() {
    return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
  }
}
