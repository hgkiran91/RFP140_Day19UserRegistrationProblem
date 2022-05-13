package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Pattern pattern = Pattern.compile("(^[A-Z]){1,}([a-z]*)$");
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Valid First Name: ");
        String firstName = input.next();
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First Name id Valid");
        } else {
            System.out.println("first Name id not valid");
        }

    }
}
