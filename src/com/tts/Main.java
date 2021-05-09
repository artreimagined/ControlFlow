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

        System.out.println("Would you like to continue? Yes or No");
        String choice = scan.nextLine();

       // boolean continueOn = (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"));

        if(choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes")) {
            System.out.println("ffhd");
        } else {
            System.out.println("Come back later!");
        }







    }

}
