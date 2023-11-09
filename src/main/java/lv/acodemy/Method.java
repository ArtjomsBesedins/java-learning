package lv.acodemy;

public class Method {
    public static void main(String[] args) {

        String acodemy = "Acodemy";
        printSomeText(10, "Acodemy!");
        printSomeText(5, "IT courses!");

        System.out.println(calculateSumOfTwoNumbers(20, 40));

        int sumOfTwoNumbers = calculateSumOfTwoNumbers(10, 20);
        System.out.println(sumOfTwoNumbers);

        printInfo("Artjoms", "Besedins");

        printInfo("John", "Job");
    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i <= loopCount; i++) {
            System.out.println("Hello World!");
        }

    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

// Create method that accepts (String name, String lastname, int age)
    // Method should print out text:
    // My name is name. My surname is lastName. I am age years old.
    // If


    public static void printInfo(String name, String lastName) {
        if (name.equals("John")) {
            System.out.println("You are fool!");
        } else {
            System.out.printf("My name is %s. My surname is %s.\n", name, lastName);
        }
    }
}





















