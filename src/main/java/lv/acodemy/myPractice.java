package lv.acodemy;

import java.util.Scanner;

public class myPractice {
    public static void main(String[] args) {


        //Write a program that accepts a number (1-7) as input and uses if-else statements to determine the corresponding day of the week (e.g., 1 is Sunday, 2 is Monday, etc.).
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number from 1-7");
        String number = myScanner.next();

        if (number.equals("1")) {
            System.out.println("Monday");
        } else if (number.equals("2")) {
            System.out.println("Tuesday");
        } else if (number.equals("3")) {
            System.out.println("Wednesday");
        } else if (number.equals("4")) {
            System.out.println("Thursday");
        } else if (number.equals("5")) {
            System.out.println("Friday");
        } else if (number.equals("6")) {
            System.out.println("Saturday");
        } else if (number.equals("7")) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not Any Day!!!");
        }
    }
}
