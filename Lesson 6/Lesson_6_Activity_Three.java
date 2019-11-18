/*
 * Lesson 6 Coding Activity Question 3
 *
 * Input a double and print the first two digits after the decimal point.
 *
 * Sample run:
 
Please input a decimal number:
57.8934
Answer: 89

 * Hint - you will need to do a numeric cast and some division and/or subtraction.
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     System.out.println("Please enter ratings from the movie review website.");
      int a=scan.nextInt();
      int b=scan.nextInt();
      int c=scan.nextInt();
    
     System.out.println("Please enter ratings from the focus group.");
      double d=scan.nextDouble();
      double e=scan.nextDouble();
    
     System.out.println("Please enter the average movie critic rating.");
      double f=scan.nextDouble();
      
     System.out.println("Average website rating: "+(((double)a+(double)b+(double)c)/3));
     System.out.println("Average focus group rating: "+((d+e)/2));
     System.out.println("Average movie critic rating: "+f);
    double g=(((double)a+(double)b+(double)c)/3);
    double h=((d+e)/2);
    double i=f;
     System.out.println("Overall movie rating: "+(g*0.2 + h*0.3 + +i*0.5));
                                                  }
}