package com.college.basics;

public class Recursion1 {
    public static void main(String[] srv) {
        printNumber(1);
    }

    public static void printNumber(int number) {
        if(number == 6) {
            return;
        }
        System.out.println(number);
        printNumber(number+1);
    }
}
