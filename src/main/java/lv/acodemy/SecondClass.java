package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 7, 9, 5};

        int myNumber = numbers[4];
        System.out.println(myNumber);

        // determine size of array
        System.out.println(numbers.length);

        // change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));

        int[] emtyArray = new int[10];
        System.out.println(Arrays.toString(emtyArray));

        emtyArray[0] = 10;
        emtyArray[1] = 2;
        emtyArray[3] = 6;
        emtyArray[7] = 9;
        emtyArray[2] = 3;

        System.out.println(Arrays.toString(emtyArray));


        // string [] array
        String[] fruitBasket = {"apples", "banana", "kiwi", "peach", "pear"};

        String fruit = fruitBasket[3];
        System.out.println(fruit);
        System.out.println(fruitBasket[3]);


        // Logic in Java

        if (10 > 5) {
            System.out.println("This statement is True!");

            if (10 < 9) {
                System.out.println("This statement is also True!");
            }

            if (fruitBasket[0].equals("apples")) {
                System.out.println("Yes, you find apples");
            }
        }


        // if-else (boolean = is/has)
        boolean isSummer = false;
        if (isSummer) {
            System.out.println("We will lay on a beach!");
        } else {
            System.out.println("We will watch Netflix series!");
        }


        //if-else-if-else

        // String light = "Red";

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color:");
        String light = myScanner.next();

        if (light.equals("Green")) {
            System.out.println("You Can Go!");
        } else if (light.equals("Yellow")) {
            System.out.println("Don`t go, please wait for Green light!");
        } else if (light.equals("Red")) {
            System.out.println("Don`t Go!");
        } else {
            System.out.println("Traffic light is not working");
        }
    }
}
