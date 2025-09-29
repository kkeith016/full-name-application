package com.pluralsight;

import java.util.Scanner;

public class fullNameApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter your middle initial: ");
        char middleInitial = keyboard.next().charAt(0);
        keyboard.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Enter any suffix if none leave blank: ");
        String Suffix =  keyboard.nextLine();

       System.out.println("Analyzing");
        System.out.println(firstName + " " + middleInitial + " " + lastName + " Welcome to the Matrix");



    }
}
