/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a three digit number:");
        int a = scan.nextInt();
        int lastDigit = a % 10;
        int middleDigit = ((a - lastDigit) % 100) / 10;
        int firstDigit = (a - (a % 100) % 1000) / 100;
        
      System.out.println("Here are the digits:");
      
      System.out.println(firstDigit);
      System.out.println(middleDigit);
      System.out.println(lastDigit);
      
      System.out.println(firstDigit + " + " + middleDigit + " + " + lastDigit + " = " + (firstDigit + middleDigit + lastDigit));


    }
}