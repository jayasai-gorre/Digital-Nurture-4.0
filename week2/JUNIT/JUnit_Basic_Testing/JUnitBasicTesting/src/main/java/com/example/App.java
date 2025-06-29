package com.example;

public class App {
    
    // Adds two integers and returns the result
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        App calculator = new App();
        int sum = calculator.add(10, 25);
        System.out.println("10 + 25 = " + sum);
    }
}
