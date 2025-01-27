package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Validator validator = new Validator();
    int test1 = validator.inputValidation(1, 10, "Enter an integer between 1 and 10: ", "Uh oh, your input wasn't an integer between 1 and 10. Try again, silly goose.", scanner);
    System.out.println("Good job!! You entered: " + test1 + ", which is valid!");
    int test2 = validator.inputValidation(Integer.MIN_VALUE, 100, "Enter an integer less than 100: ", "Uh oh, your input wasn't and integer less than 100. Try again, silly goose.", scanner);
    System.out.println("Good job!! You entered: " + test2 + ", which is valid!");
    int test3 = validator.inputValidation(1, Integer.MAX_VALUE, "Enter an integer greater than 1: ", "Uh oh, your input wasn't an integer greater than 1. Try again, silly goose.", scanner);
    System.out.println("Good job!! You entered: " + test3 + ", which is valid!");
    int test4 = validator.inputValidation(Integer.MIN_VALUE, Integer.MAX_VALUE, "Enter ANY integer: ", "Uh oh, your input wasn't an integer. Try again, silly goose.", scanner);
    System.out.println("Good job!! You entered: " + test4 + ", which is valid!");
    scanner.close();
  }
}
