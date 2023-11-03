package com.bangbangas.oop.project;

/**
 * ClassName: Pizza
 * Package: com.bangbangas.oop.project
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 15:36
 * @Version 1.0
 */
public class Pizza {
    private String name;
    private double size;
    private double price;

    public void printInfo(){
        System.out.println(name+" "+size+" "+price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza(String name, double size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
}
