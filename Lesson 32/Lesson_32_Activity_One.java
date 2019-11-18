import java.util.Scanner;

class Lesson_32_Activity_One {
      
        public static void monthName(int month){
          String [] arr = {"January","February","March","April","May","June","July","August","September","October","November","December"};
          System.out.println(arr[month - 1]);
        }
        
        public static void main(String[] args){
          monthName(8);
        }
}