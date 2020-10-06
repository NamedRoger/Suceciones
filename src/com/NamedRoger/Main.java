package com.NamedRoger;

public class Main {

    public static void main(String[] args) {
        Primo primo = new Primo(10);
        Fibonacci fibonacci = new Fibonacci(10);

        var primos = primo.getPrimos();
        var fibonaccis = fibonacci.getFibonacci();

        for(var p : primos)System.out.print(p + " ");
        System.out.println("");
        for(var f : fibonaccis)System.out.print(f + " ");

    }



}
