/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.structural.decorator;

/**
 *
 * @author DT234016
 */
public class NuttyDecorator extends IceCreamDecorator {

  public NuttyDecorator(IceCream specialIceCream) {
    super(specialIceCream);
  }

  @Override
  public String makeIceCream() {
    return specialIceCream.makeIceCream() + addNuts();
  }

  private String addNuts() {
    return " + crunchy nuts";
  }
}
