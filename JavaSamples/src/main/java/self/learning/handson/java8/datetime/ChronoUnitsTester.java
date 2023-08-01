/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author DT234016
 */
public class ChronoUnitsTester {

  public static void main(String args[]) {
    ChronoUnitsTester java8tester = new ChronoUnitsTester();
    java8tester.testChromoUnits();
  }

  public void testChromoUnits() {
    //Get the current date
    LocalDate today = LocalDate.now();
    System.out.println("Current date: " + today);

    //add 1 week to the current date
    LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
    System.out.println("Next week: " + nextWeek);

    //add 1 month to the current date
    LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
    System.out.println("Next month: " + nextMonth);

    //add 1 year to the current date
    LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
    System.out.println("Next year: " + nextYear);

    //add 10 years to the current date
    LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
    System.out.println("Date after ten year: " + nextDecade);
  }
}
