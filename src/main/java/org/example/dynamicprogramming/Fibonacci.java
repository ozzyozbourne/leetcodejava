package org.example.dynamicprogramming;

public class Fibonacci {

    public int fib(int n) {
        if (n == 0) return 0;
        int one = 1, two = 0;
        for(int i = 0; i < n-1; i++ ){
            one += two;
            two = one -two;
        }return one;
    }
}
