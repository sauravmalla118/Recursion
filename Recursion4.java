package com.college.basics;

public class Recursion4 {
    public static void main(String[] args) {
        Recursion4 r = new Recursion4();
        r.printSum(1,5,0);
    }

    public static void printSum(int n,int b,int sum) {
        if(n==b) {
            sum += n;
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n+1,b,sum);
        System.out.println(n);
    }
}
