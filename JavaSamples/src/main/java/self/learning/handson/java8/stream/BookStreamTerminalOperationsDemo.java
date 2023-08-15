/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import self.learning.handson.pojo.Book;

/**
 *
 * @author Dell
 */
public class BookStreamTerminalOperationsDemo {
    
    public static void main(String [] args)
    {
        List<Book> books = List.of(
        new Book("Monk","RobinSharma",300.00,259,true),
        new Book("HouseOfCards","SudhaMurthy",500.00,359,true),
        new Book("RichDadPoorDad","Robert",800.00,295,false),
        new Book("1984","George",50.50,328,true),
        new Book("The Hobbit","Tolkein",41.95,310,true));
        
        //forEach-Print details of each available book
        System.out.println("Available Books");
        books.stream().filter(Book :: isAvailable)
                .forEach(book -> System.out.println("Title : " + book.getTitle() + " Author : " + book.getAuthor() + "Price: $" + book.getPrice()));
        
        //count - Count the total number of books
        long bookCount = books.stream().count();
        System.out.println("\n Totalbooks : "+ bookCount);
        
        //collect - Collect details of books by SudhaMurthy
        List<String> sudhaBooks = books.stream().filter(book -> book.getAuthor().equals("SudhaMurthy")).map(Book :: getTitle).collect(Collectors.toList());
        System.out.println("\n SudhaMurthy Books : " + sudhaBooks);
        
        //fimd the cheapest price book
        Optional<Double> cheapestPrice = books.stream().map(Book :: getPrice).min(Double::compare);            
        System.out.println("\n Cheapest Book Price : $ " + cheapestPrice.orElse(-1.0));
        
        //max pagecount
        Optional<Integer> highestPageCount = books.stream().map(Book :: getPageCount).max(Integer::compare);            
        System.out.println("\n Highest page count " + highestPageCount.orElse(-1));
        
        //find the details of first book
        Book firstBook = books.stream().findFirst().orElse(null);
        System.out.println("\n FirstBook " + (firstBook!=null ? firstBook.getTitle() : "None"));
        
        //find any available book
        Book availableBook = books.stream().filter(Book::isAvailable).findAny().orElse(null);
        System.out.println("\n Any Available Book " + (availableBook!=null ? availableBook.getTitle() : "None"));
        
        //find if all books are available 
        boolean availableBooks = books.stream().allMatch(Book::isAvailable);
         System.out.println("\n Is all books available " + availableBooks);  
         
         //find if books are present with more than 300 pages
        boolean anyLongBook = books.stream().anyMatch(book -> book.getPageCount()>300);
         System.out.println("\n Is longBook available " + anyLongBook);
         
           //find if books are out of stock 
        boolean outOfStockBooks = books.stream().noneMatch(book -> !book.isAvailable());
         System.out.println("\n Is none books out of stock " + outOfStockBooks);
         
         //Reduce - calculate the total price of all the books
         double totalPrice = books.stream().map(Book::getPrice).reduce(0.0, Double::sum);
         System.out.println("\n Price of all the books " + totalPrice);
         
         //Convert book titles to an Array
         String[] booksTitleArray = books.stream().map(Book::getTitle).toArray(String[]::new);
         System.out.println("\n Book Titles " + Arrays.toString(booksTitleArray));         
    }
    
}
