import java.util.Scanner;

class Lesson_32_Activity_Two {
         
        public static void monthDays(int month){
          int arr [] = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
          System.out.println(arr[month-1]);
        }
      
        public static void main(String[] args)
        {
           monthDays(2);
           monthDays(9);
        }
}