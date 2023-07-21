/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.sorting;

import java.util.Comparator;
import self.learning.handson.pojo.Employee;

/**
 *
 * @author DT234016
 */
public class AgeComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee e1, Employee e2) {
    return Integer.compare(e1.getAge(), e2.getAge());
  }
  
}
