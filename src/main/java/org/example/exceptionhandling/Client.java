package org.example.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println(number);

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int out = x / y;

            // System.exit(0); // Terminate the application.
        } catch (InputMismatchException e) {
            System.out.println("You have entered wrong input, please correct it and retry");
        } catch (ArithmeticException e) {
            System.out.println("Dividing by ZERO isn't possible");
        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("After catch block");
    }
}
