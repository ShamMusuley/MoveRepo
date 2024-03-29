/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8;

/**
 *
 * @author DT234016
 */
public class LambdaTester {
/*
Note: It is important to emphasize that a lambda expression can use and modify
an instance variable from its invoking class. It just can’t use a local variable
of its enclosing scope unless that variable is effectively final.  
*/
  public static void main(String args[]) {
    // Lambda Expression sample.
    LambdaTester tester = new LambdaTester();

    //with type declaration
    MathOperation addition = (int a, int b) -> a + b;

    //with out type declaration
    MathOperation subtraction = (a, b) -> a - b;

    //with return statement along with curly braces
    MathOperation multiplication = (int a, int b) -> {
      return a * b;
    };

    //without return statement and without curly braces
    MathOperation division = (int a, int b) -> a / b;

    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
    System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
    System.out.println("10 / 5 = " + tester.operate(10, 5, division));

    //without parenthesis
    GreetingService greetService1 = message
            -> System.out.println("Hello " + message);

    //with parenthesis
    GreetingService greetService2 = (message)
            -> System.out.println("Hello " + message);

    greetService1.sayMessage("Mahesh");
    greetService2.sayMessage("Suresh");
  }

  interface MathOperation {

    int operation(int a, int b);
  }

  interface GreetingService {

    void sayMessage(String message);
  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }
}
