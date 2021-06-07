/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 5 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:*/

package org.example;
import java.util.Scanner;

public class practiceexample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number? ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

    }
}
