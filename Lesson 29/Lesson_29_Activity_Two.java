/*
 * Lesson 29 Coding Activity 2
 * Write a loop that processes an array of strings. 
 * Each String should be printed backwards on its own line.
 * 
 * For example, if the list contains:
 *     
 *     {"every", "nearing", "checking", "food", "stand", "value"}
 * 
 * It should output:
 *     yreve
 *     gniraen
 *     gnikcehc
 *     doof
 *     dnats
 *     eulav
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_29_Activity_Two {
  
    public static String [] list = {"every", "nearing", "checking", "food", "stand", "value"};
    
    public static void main(String[] args)
    {
      String backwards = "";
      for(int i = 0; i < list.length; i++){
        for(int n = 0; n < list[i].length(); n++){
          backwards = backwards + list[i].substring( list[i].length() - n - 1 , list[i].length() - n );
        }
        System.out.println(backwards);
        backwards = "";
      }
    }
}