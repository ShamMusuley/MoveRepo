/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.structural.decorator;

/**
 *
 * @author DT234016
 */
public abstract class IceCreamDecorator implements IceCream {

  protected IceCream specialIceCream;

  public IceCreamDecorator(IceCream specialIceCream) {
    this.specialIceCream = specialIceCream;
  }

  public String makeIceCream() {
    return specialIceCream.makeIceCream();
  }
}
