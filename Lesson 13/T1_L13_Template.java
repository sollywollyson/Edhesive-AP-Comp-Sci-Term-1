/*
 * Lesson 13 - Unit 2 - Else
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson13_template{

     public static void main (String str[]) throws IOException {
       Scanner scan = new Scanner(System.in);
       
       int grade = scan.nextInt();
       
       if(grade >=60) 
       {
         System.out.println("passing grade ");
     }else{
       System.out.println("failing");
     
     }
     }}