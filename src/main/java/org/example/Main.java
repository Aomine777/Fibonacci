package org.example;

public class Main {
    public static void main(String[] args) {
    FibonacciSequence fibonacciSequence = new FibonacciSequence();
    System.out.println("fibonacciSequence.iterativeFib(7) = " + fibonacciSequence.iterativeFib(6));
    System.out.println("fibonacciSequence.recursiveFib(7) = " + fibonacciSequence.recursiveFib(6));
    System.out.println("fibonacciSequence.dynamicFib(7) = " + fibonacciSequence.dynamicFib(6));
    }
}