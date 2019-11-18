import java.util.Scanner;

class Lesson_32_Activity_Three {
      
        public static void swap(int x, int y)
          {
          int temp;
          temp=x;
          x=y;
          y = temp;
          System.out.println(x + " " + y);
          }
        public static void main(String[] args)
         {
         swap(7,3);
         }
}