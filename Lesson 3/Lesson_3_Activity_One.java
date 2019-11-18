/*
 * Lesson 3 Coding Activity Question 1
 * 
 * Write the code to ask the user to enter their name and print the following message:

Hi ______, nice to see you.
 
 * Remember, you'll need to use the method println and Scanner class method nextLine.
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_3_Activity_Three {
    public static void main(String[] args) {
          Scanner scan = new Scanner (System.in);
 
          String n;
          String b;
          System.out.println("Please enter your name and an adjective");
          n=scan.nextLine();
          b= scan.nextLine();
          System.out.println("My name is "+n+"."+" I am "+b+".");
    }
}
          
          