/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import self.learning.handson.pojo.Employee;

/**
 *
 * @author DT234016
 */
public class EmployeeSortTest {
  public static void main(String[] args) {
    Employee e1 = new Employee("Sham", 34, "Senior Software Engineer");
    Employee e2 = new Employee("Supriya", 29, "Software Engineer");
    Employee e3 = new Employee("Ravi", 41, "Test Lead Engineer");
    Employee e4 = new Employee("Nethra", 35, "Quality Engineer");
    Employee e5 = new Employee("Pradeep", 41, "Project Manager");
    Employee e6 = new Employee("Roopa", 37, "Lead Software Engineer");
    
    ArrayList<Employee> empList = new ArrayList<>();
    empList.add(e1);
    empList.add(e2);
    empList.add(e3);
    empList.add(e4);
    empList.add(e5);
    empList.add(e6);
    empList.stream().forEach(emp -> System.out.println("employee info before sorting: " + emp));
    System.out.println("--------------------------------------------------------------------");
    // sorting based on natural ordering (Employee Name) using Comparable interface.
    Collections.sort(empList);
    empList.stream().forEach(emp -> System.out.println("employee info after sorting using Comparable: " + emp));
    System.out.println("--------------------------------------------------------------------");
    AgeComparator ageComp = new AgeComparator();
    // sorting by Age using Comparator interface.
    Collections.sort(empList, ageComp);
    empList.stream().forEach(emp -> System.out.println("employee info after sorting using AgeComparator: " + emp));
    System.out.println("--------------------------------------------------------------------");
    // sorting by designation using lambda expression.
    Comparator<Employee> designationComp = (Employee emp1, Employee emp2)
            -> emp1.getDesignation().compareTo(emp2.getDesignation());
    Collections.sort(empList, designationComp);
    empList.stream().forEach(emp -> System.out.println("employee info after sorting using DesignationComparator: " + emp));
  }
}
