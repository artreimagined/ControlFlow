package com.tts;

import java.util.Scanner;

public class AsciiChars {

    public static void printNumbers() {
        System.out.println("Input a message");
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();


        for (int i = 0; i < message.length(); i++) {
//            System.out.println((char)i + "  =  " + i);
            System.out.println((int) message.charAt(i));
        }

//        for(int i=48;i<=57;i++){
//            System.out.print((char)i);
//        }
//        System.out.println();

        //        for(int i = 65; i <= 90; i++)
//        {
//        System.out.println();
//        strMessage.chars().forEach(c -> System.out.print(c));
//        System.out.println();

//        char char1 = 'Z';
//        int ascii = char1;
//        System.out.println(ascii);
    }

    public static void printLowerCase() {
        // TODO: print valid lowercase alphabetic input
        //char char1;
//        for (char char1= 'a'; char1 <= 'z'; char1++) {
//            System.out.printf("%s ", char1 + "\n");
////            System.out.println("Lowercase " + char1);
//        }

        System.out.println("Valid lowercase inputs:");
        for(int i=97;i<=122;i++){
            System.out.print((char)i);
        }
        System.out.println();

    }

    public static void printUpperCase() {
        //char char1;

//        for (char char1 = 'A'; char1 <= 'Z'; char1++) {
//            //System.out.println("%s ", char1 + "\n");
//            System.out.println("Uppercase " + char1);
//        }


        System.out.println("Valid uppercase inputs:");
        for(int i=65;i<=90;i++){
            System.out.print((char)i);
        }
        System.out.println();
    }
    
}
