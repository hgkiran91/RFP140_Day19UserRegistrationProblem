package com.bridgelabz.regex;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner input = new Scanner(System.in);
    private static final String NAME_PATTERN = "(^[A-Z]){1,}([a-zA-Z]*)$";
    private static final String EMAIL_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
    private static final String PHONE_NUMBER_PATTERN = "(^[9]{1}[1]{1}[ ])?[6-9]{1}[0-9]{9,}$";
    private static final String PASSWORD_PATTERN = "[a-z]{8,}$";
    private static final String PASSWORD_PATTERN2 = "(?=.*[A-Z])[a-zA-Z]{8,}$";
    private static final String PASSWORD_PATTERN3 = "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
    private static final String PASSWORD_PATTERN4 = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";

    public void validFirstName() {

        System.out.println("Enter Valid First Name: ");
        String firstName = input.next();
        Pattern pattern = Pattern.compile(NAME_PATTERN);
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
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Last Name id Valid");
        } else {
            System.out.println("Last Name id not valid");
        }
    }

    public void validEmail() {

        System.out.println("Enter Valid Email:");
        String email = input.next();
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public void validPhoneNumber() {

        System.out.println("Enter your Phone Number: ");
        String pNumber = input.next();
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(pNumber);
        if (matcher.matches()) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }

    public void validPasswordRule1() {

        System.out.println("Enter your Password: ");
        String password = input.next();
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public void validPasswordRule2() {

        System.out.println("Enter your Password: ");
        String password = input.next();
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN2);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public void validPasswordRule3() {

        System.out.println("Enter your Password: ");
        String password = input.next();
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN3);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public void validPasswordRule4() {

        System.out.println("Enter your Password: ");
        String password = input.next();
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN4);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public ArrayList<String> emailList = new ArrayList<>();
    public void emailPatternCheck() {

        System.out.println("Enter Valid Email:");
        String email = input.next();
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        //userRegistration.validFirstName();
        //userRegistration.validLastName();
        //userRegistration.validEmail();
        //userRegistration.validPhoneNumber();
        //userRegistration.validPasswordRule1();
        //userRegistration.validPasswordRule2();
        //userRegistration.validPasswordRule3();
        //userRegistration.validPasswordRule4();
        userRegistration.emailPatternCheck();
    }
}
