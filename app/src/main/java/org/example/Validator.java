package org.example;
import java.util.Scanner;
public class Validator {
    
    public int inputValidation(int Lbound, int Ubound, String promptMsg, String errorMsg, Scanner scanner) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println(promptMsg);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input < Lbound || input > Ubound) {
                    System.out.println(errorMsg);
                } else {
                    isValid = true;
                }
            } else {
                System.out.println(errorMsg);
                scanner.next();
            }
        }
        return input;
    }
}
