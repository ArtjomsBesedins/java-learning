package lv.acodemy;

public class SecondLessonExercises {
    public static void main(String[] args) {
        // 1.Even or Odd Number Checker:
        // Write a program that takes an integer input
        // from the user and checks if it's even or odd using an if statement.

//        int number = 11;
//        if (number % 2 == 0) {
//            System.out.println("This is even number!");
//        } else {
//            System.out.println("This is odd number!");
//        }

//        Largest of Three Numbers:
//        Create a program that takes three numbers as input
//        and determines which one is the largest using if-else-if statements.

        int x = 10;
        int y = 12;
        int z = 14;

        if (x > y && x > z) {
            System.out.println("x this is the larges number!");
        } else if (y > x && y > z) {
            System.out.println("y this is largest number");
        } else {
            System.out.println("Whatever!");
        }
        System.out.println(Math.max(10, Math.max(12, 14)));

        int num = 10;
        if (num == 0) {
            System.out.println("Number iz Zero!");
        } else if (num < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("Positive number");


//    3. exercise

            double weight = 59.2;
            double height = 1.75;
            double bmi = weight / (height * height);
            System.out.println(bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
                System.out.println("Minimal health risk");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Normal");
                System.out.println("Minimal health risk");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("Overweight");
                System.out.println("Increased health risk");
            } else if (bmi >= 30 && bmi <= 34.9) {
                System.out.println("Obese");
                System.out.println("High health risk");
            } else if (bmi >= 35 && bmi <= 39.9) {
            } else if (bmi >= 35 && bmi <= 39.9) {
                System.out.println("Severely Obese");
                System.out.println("Very high health risk");
            } else {
                System.out.println("Morbidly Obese");
                System.out.println("Extremely high health risk");


                int passwordCharacterCount = 8;
                if (passwordCharacterCount < 8) {
                    System.out.println("Weak password!");
                } else if (passwordCharacterCount >= 8 && passwordCharacterCount <=11) {
                    System.out.println("Medium strength password!");
                } else {
                    System.out.println("Your password is strong enough!");
                }


            }

        }

    }


}



