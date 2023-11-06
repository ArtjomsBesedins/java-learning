package lv.acodemy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 8, 10, 11};

        int myNumber = numbers[4];
        System.out.println(myNumber);

        System.out.println(numbers.length);

        int[] emptyArray = new int[10];
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[1] = 5;
        emptyArray[5] = 6;
        emptyArray[2] = 4;
        emptyArray[8] = 12;

        System.out.println(Arrays.toString(emptyArray));

        String[] fruitBasket = {"coconut", "orange", "watermelon", "banana", "blueberry"};

        String fruit = fruitBasket[4];
        System.out.println(fruit);
        System.out.println(fruitBasket[4]);

        if (10 > 5) {
            System.out.println("This statement is true!");
        }

        if (10 < 9) {
            System.out.println("This statement is also true!");

        }

        if (fruitBasket[0].equals("coconut")) {
            System.out.println("Yes, you find coconut");
        }

        boolean isSummer = false;

        if (isSummer) {
            System.out.println("We will lay on a beach!");
        } else {
            System.out.println("We will watch Netflix series!");
        }
//        String light = "RED"; // contains color of traffic light

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color:");
        String light =myScanner.next();

        if (light.equals("GREEn")) {
        System.out.println("You can go!");
        } else if (light.equals("YELLOW")) {
            System.out.println("Don't go,please wait for Green light!");
        } else if (light.equals("RED")) {
            System.out.println("Don't go!");
        } else {
            System.out.println("Traffic light is not workinh!");
        }


    }
    }

