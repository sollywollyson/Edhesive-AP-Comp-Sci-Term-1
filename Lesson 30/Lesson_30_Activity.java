/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Note that this activity does not require you to print anything. 
 * Your code should end with the array list still declared and
 * containing the resulting words.
 * 
 */


import java.util.Scanner;

class Lesson_30_Activity {
     
    public static String [] list = {"every", " near ing ", " checking", "food ", "stand", "value "};
  
    public static void main(String[] args)
    {
        for (int i = 0; i < list.length; i++)
        {
            String temp = list[i];
            int n = 0;
            while (n < temp.length())
            {
                if (temp.charAt(n) == ' '){
                    temp = temp.substring(0, n) + temp.substring(n + 1);
                    n = 0;
                }
                else{
                    n++;
                }
            }
            list[i] = temp;
        }
    }
}