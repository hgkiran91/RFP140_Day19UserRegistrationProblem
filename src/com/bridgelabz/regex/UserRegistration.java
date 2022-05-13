package com.bridgelabz.regex;

import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner input = new Scanner(System.in);
    private static final String NamePattern = "(^[A-Z]){1,}([a-zA-Z]*)$";

    public void validFirstName() {

        System.out.println("Enter Valid First Name: ");
        String firstName = input.next();
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First Name id Valid");
        } else {
            System.out.println("first Name id not valid");
        }
    }

    public void validLastName() {

        System.out.println("Enter Valid Last Name: ");
        String lastName = input.next();
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Last Name id Valid");
        } else {
            System.out.println("Last Name id not valid");
        }
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        userRegistration.validFirstName();
        userRegistration.validLastName();
    }
}
