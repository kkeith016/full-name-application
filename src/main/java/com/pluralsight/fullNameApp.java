package com.pluralsight;

import java.util.Scanner;

public class fullNameApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("---Who are you?--- ");

        System.out.print("Enter your name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter your middle initial: ");
        char middleInitial = keyboard.next().charAt(0);
        keyboard.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Enter any suffix if none leave blank: ");
        String suffix =  keyboard.nextLine();

       System.out.println("Analyzing...");
        System.out.println(".....");
        System.out.println(".........");
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);
        System.out.println(firstName + " " + middleInitial + " " + lastName + " Welcome I am Morphius");



    }
}
