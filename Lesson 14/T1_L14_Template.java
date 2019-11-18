/*
 * Lesson 14 - Unit 2  - Boolean Conditions
 *  
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson14_template{

     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          int grade = scan.nextInt();
          
          if(grade >= 80 && grade < 90)
          {
            System.out.println("B");
          }

     }

}


