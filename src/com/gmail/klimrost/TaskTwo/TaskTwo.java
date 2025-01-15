package com.gmail.klimrost.TaskTwo;

public class TaskTwo {
    public static void main(String[] args) {
        byte number = 1;
        String product = "smartphone";
        double price = 12153.41;

        double total = price / 5;

        System.out.println("Order No " + number);
        System.out.println("Product: " + product);
        System.out.printf("Sales by day is EUR: %.2f%n", total);
        System.out.println("Total sales for 5 days is EUR: " + price);

        number++;
        product = "laptop";
        price = 10486.85;
        total = price / 7;
        System.out.println("Order No " + number);
        System.out.println("Product: " + product);
        System.out.printf("Sales by day is EUR: %.2f%n", total);
        System.out.println("Total sales for 7 days is EUR: " + price);
    }
}







