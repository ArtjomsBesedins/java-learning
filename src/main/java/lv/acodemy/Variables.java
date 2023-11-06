package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        // int (number)
        int myCurrentAge = 19;
        System.out.println(myCurrentAge);

        /*
        This is
        hate comment
        approach
        TODO: Delte it later
         */

        byte myWeight = 59; // byte data type
        short salary = 2000; // short data type
        char myFirstLetterOfName = 'A'; // character data type
        long populationOfLatvia = 1900000; //long data type
        double numberPi = Math.PI; //PI number
        float randomNumber = 313131.1222f;
        double classicFloatingNumber = 123123123123.34543634634; //double number

        //Bolean true/false  is,has
        //Example: isSummer;isAdult;hasProperValue
        boolean isSummer = false;
        boolean isAutumn = true;

        // Exercise 1.
        // Create 2 variables for each data type
        // Variable should be meaningful as it possible
        // Variable name should contain at least 2 words
        // lower camel case
        // Print all the variable values

        long myDreamSalary = 1000000;
        System.out.println(myDreamSalary);
        char myLastLetterOfSurname = 'N';
        System.out.println(myLastLetterOfSurname);

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;

        int summa = x + y + z;
        System.out.println(summa);

        int summaExample = 10 + 5 + 2 + x + y + 4 + z;
        System.out.println(summaExample);

        //2a(a+b); result?
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        //2 * 3 (4 * 3);
        System.out.println(result);

        int remainder = 10 % 3;
        System.out.println(remainder);

        // String (non-primitive)

        String firstName = "Artjom";
        String lastName = "Besedin";

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);
        System.out.printf("My full name is %s %s\n", firstName, lastName);
        System.out.println("Hello www");


        String mySchool = "RUV";
        System.out.println("Now I am currently studying in: " + mySchool + ".");
        System.out.printf("Now I am currently studying in: %s.\n", mySchool);

        String fullSentence = firstName + " " + lastName + "." + " I am " + myCurrentAge + "years old";
        System.out.println(fullSentence);

        //Exercise 2
        //Create two-three String variables
        //Combine (concatenate)
        //Print result out
        //Example: Today is Monday. Soon I will go home;

        String myCar = "Mitsubishi";
        System.out.println("Now I have this brand of car: " + myCar + ".");
        System.out.printf("Now I have this brand of car: %s. \n", myCar);

        String myWork = "Zara";
        System.out.println("Tomorrow I will go to my job at: " + myWork + ".");
        System.out.printf("Tomorrow I will go to my job at: %s. \n", myWork);
    }
}