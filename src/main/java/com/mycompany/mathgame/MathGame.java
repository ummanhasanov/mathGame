/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mathgame;

/**
 *
 * @author Umman Hasan
 */
import java.util.Random;
import java.util.Scanner;

public class MathGame {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int points = 0;
    
    while (points < 5) {
      // Generate two random numbers between 1 and 10
      int num1 = random.nextInt(10) + 1;
      int num2 = random.nextInt(10) + 1;
      
      // Generate a random operator
      char operator;
      int operatorInt = random.nextInt(3);
      if (operatorInt == 0) {
        operator = '+';
      } else if (operatorInt == 1) {
        operator = '-';
      } else {
        operator = '*';
      }
      
      // Calculate the correct answer
      int answer;
      if (operator == '+') {
        answer = num1 + num2;
      } else if (operator == '-') {
        answer = num1 - num2;
      } else {
        answer = num1 * num2;
      }
      
      // Prompt the user to solve the equation
      System.out.println("What is " + num1 + " " + operator + " " + num2 + "?");
      int response = scanner.nextInt();
      
      // Check if the user's answer is correct
      if (response == answer) {
        System.out.println("Correct!");
        points++;
      } else {
        System.out.println("Wrong, the correct answer is " + answer);
      }
    }
    System.out.println("You win!");
  }
}

