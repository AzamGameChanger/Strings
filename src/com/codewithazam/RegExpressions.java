package com.codewithazam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressions {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter your regex : ");
                String regexInput = input.next();
                Pattern pattern = Pattern.compile(regexInput);
                Matcher matcher = pattern.matcher("Welcome to the jungle my friend!");

                boolean found = false;
                while (matcher.find()) {
                    System.out.println("I found the text " +
                            matcher.group() + " starting at index " +
                            matcher.start() + " and ending at index " +
                            matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.println("Matcher not found.");
                }
            }
        }
    }
}
