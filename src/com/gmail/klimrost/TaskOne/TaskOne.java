package com.gmail.klimrost.TaskOne;

public class TaskOne {
    public static void main(String[] args) {
        byte number = 1;
        String client = " Alice.";
        String product = "smartphone;";
        double price = 305.99;
        String address = "Moon Street, 10.";

        System.out.println("Order No " + number + "Client: " + client + ".");
        System.out.println("Product:" + product);
        System.out.println("Price:" + price);
        System.out.println("Address:" + address);

        number++;
        client = "Tom.";
        product = "laptop;";
        price = 570.95;
        address = "Terra Street, 17.";

        System.out.println("Order No " + number + "Client: " + client + ".");
        System.out.println("Product:" + product);
        System.out.println("Price:" + price);
        System.out.println("Address:" + address);
    }
}
