package com.bangbangas.decision;
/**
 * ClassName: Book
 * Package: com.bangbangas.decision
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 15:43
 * @Version 1.0
 */
public class Book {
    private String bookname;
    private String author;
    private Double price;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String showInfo(){
        return "bookname"+bookname+"author"+author+"price"+price;
    }
}

