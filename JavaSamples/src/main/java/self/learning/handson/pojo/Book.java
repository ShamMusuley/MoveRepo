/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.learning.handson.pojo;

import lombok.Data;

/**
 *
 * @author Dell
 */
@Data
public class Book {
    private String title;
    private String author;
    private double price;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, double price, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pageCount = pageCount;
        this.available = available;
    }
    
}