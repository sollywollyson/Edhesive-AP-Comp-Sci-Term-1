/*
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade. 
 * For example, if a user enters 4, print "A", and if they enter 0 print "F." 
 * You can assume that an integer between 0 and 4 will be input.
 */


import java.util.Scanner;

class Lesson_13_Activity_Four {
    public static void main(String[] args)
     {
Scanner scan = new Scanner(System.in);
  System.out.println("Enter a number between 1 and 4.");
  int a=scan.nextInt();
  if(a==4)
    System.out.println("A");
  if(a==3)
    System.out.println("B");
  if(a==2)
    System.out.println("C");
  if(a==1)
    System.out.println("D");
  if(a==0)
    System.out.println("F");
    }
}