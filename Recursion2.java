package com.college.basics;

public class Recursion2 {
    public static void main(String[] srv) {
        Recursion2 r = new Recursion2();
        r.printNum(5);
    }

    void printNum(int number) {
        if(number == 0) {
            return;
        }
        System.out.println(number);
        printNum(number-1);
    }
}
