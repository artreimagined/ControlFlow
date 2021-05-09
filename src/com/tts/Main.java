package com.tts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World");

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello " + name);

        System.out.println("Would you like to continue? Yes or No?");
        String choice1 = scan.next();

       // boolean continueOn = (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"));

        if(choice1.equalsIgnoreCase("Y") || choice1.equalsIgnoreCase("Yes")) {
            String again = null;
            do {
                System.out.println("What is the name of your favorite pet?");
                String petName = scan.next();
                System.out.println("Aww " + petName + "is a cute name!");
    
                System.out.println("What is your pet's age?");
                int petAge = scan.nextInt();
                System.out.println("Cool, " + petName + " is " + petAge + ".");
    
                System.out.println("What is their lucky number?");
                int luckyNum = scan.nextInt();
                System.out.println("Your lucky number is " + luckyNum + ".");

                boolean favQB = false;
                System.out.println("Do you have a favorite quarterback? Yes or No?");
                String choice2 = scan.next();
                if(choice2.equalsIgnoreCase("Y") || choice2.equalsIgnoreCase("Yes")) {
                    System.out.println("What is their jersey number?");
                } else System.out.println("Type a random number two-digit number.");
                int jerseyNum = scan.nextInt();

                System.out.println("What is the two-digit model year of your car?");
                int modelYr = scan.nextInt();

                System.out.println("What is the first name of your favorite actress or actor?");
                String favActor = scan.next();
                System.out.println(favActor + " is amazing!");

                System.out.println("Enter a random number between 1 and 50.");
                int randNum = scan.nextInt();
                if(randNum > 50 || randNum < 1) {
                    System.out.println("That number is not between 1 and 50. Try again!");
                } else System.out.println(randNum + ", thank you!");




            } while(again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));
                
            

        } else {
            System.out.println("Return later to complete the survey!");
        }







    }

}
