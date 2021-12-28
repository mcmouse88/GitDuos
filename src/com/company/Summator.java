package com.company;

public class Summator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return (a * b) * sum(a, b);
    }
}
