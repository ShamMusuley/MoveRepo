/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author DT234016
 */
@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
  private String name;
  private int age;
  private String designation;

  @Override
  public int compareTo(Employee e) {
    return this.name.compareTo(e.getName());
  }
}
