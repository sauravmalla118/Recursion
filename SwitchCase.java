package com.college.basics;

import java.util.Scanner;
public class SwitchCase {

    void advancedSwitchCase(int number) {
        switch (number) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid choice..");
        }
    }

        void traditionalSwitchCase(int number) {
            switch (number) {
                case 1:
                    System.out.println("Sunday");
                        break;
                case 2:
                    System.out.println("Monday");
                        break;
                case 3:
                    System.out.println("Tuesday");
                        break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid Choice .. press right choice");
            }

        }


    public static void main(String[] srv) {
        // program to print days of the week by using switch case in java
        SwitchCase s = new SwitchCase();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 - sunday ..... 7 - saturday : ");
        int number = sc.nextInt();
        s.advancedSwitchCase(number);
        s.traditionalSwitchCase(number);


    }
}
