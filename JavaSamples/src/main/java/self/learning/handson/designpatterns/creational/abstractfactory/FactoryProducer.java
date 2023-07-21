/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.designpatterns.creational.abstractfactory;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author DT234016
 */
public class FactoryProducer {

  public static AbstractFactory getFactory(String computerType, String ram, String hdd, String cpu) {
    if (StringUtils.isNotBlank(computerType) && computerType.equalsIgnoreCase("PC")) {
      return new PCFactory(ram, hdd, cpu);
    } else {
      return new ServerFactory(ram, hdd, cpu);
    }
  }
}
