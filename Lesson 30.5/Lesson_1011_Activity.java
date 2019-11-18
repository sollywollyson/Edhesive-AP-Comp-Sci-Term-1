/*
 * Lesson 30 1/2 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity{
    public static void main(String[] args)
     {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter a number in base 8:");
      String eight = scan.nextLine();
      int n = Integer.parseInt(eight);
      int count = 0;
      int oldNum;
      int newNum;
      int total = 0;
      //tests if the number is more than 8 digits and also positive
      if(n < 77777777 && n >= 0)
      {
        //this while loop counts the number of digits
        while (n != 0)
        {
          n /= 10;
          count++;
        }
        String[] arrOld = new String[count];
        //this for loop is to put each digit into array
        for(int i = 0; i < count; i++)
        {
          arrOld[i] = eight.substring(i, i+1);
          //tests if any of the numbers are bigger than 7
          if(Integer.parseInt(arrOld[i]) > 7)
          {
            System.out.println("ERROR: Incorrect Octal Format");
            return;
          }
        }
        int [] arrNew = new int [count];
        int p = count - 1;
        //this for loop is used to calculate the base 8 digits into base 10 digits and add them to the total base 10 number.
        for(int s = 0; s < count; s++)
        {
          arrNew[s] = Integer.parseInt(arrOld[s]);
          arrNew[s] = arrNew[s] * (int)(Math.pow(8, p));
          System.out.println(arrNew[s]);
          total += arrNew[s];
          p = p - 1;
        }
        System.out.println(total);
      }
      else{
        System.out.println("ERROR: Incorrect Octal Format");
      }
     }
}