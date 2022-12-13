package com.college.basics;

public class Recursion3 {
    public static void main(String[] args) {
        int ans = factorial(5);
        System.out.println(ans);
    }

    public static int factorial(int number) {
        if(number == 1 || number == 0) {
            return (1);
        } else {
            return(number*factorial(number-1));
        }
    }
}
