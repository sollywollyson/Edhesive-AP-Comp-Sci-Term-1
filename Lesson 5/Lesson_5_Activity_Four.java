/*
 * Lesson 5 Coding Activity Question 4
 * 
 * Ask the user to enter the price of an item and tell them 
 * how much money they would get back from $20. It's okay to 
 * return a negative number. Also, Don't forget to include the dollar sign.
 *
 * Sample Run:

Enter a price:
3.50
Change from $20: $16.5

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_5_Activity_Four {
    public static void main(String[] args) {
      
int num = scan.nextInt();
 int sum = 0;

while ( num > 0) {
    sum += num % 10;
    num /= 10;
}
System.out.print(sum);
    }
}