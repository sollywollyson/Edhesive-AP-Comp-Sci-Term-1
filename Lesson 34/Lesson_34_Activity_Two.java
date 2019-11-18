import java.util.Scanner;

class Lesson_34_Activity_Two {
  
   public static double average(int [] a)
    {
     double total = 0.0;
     for(int i = 0; i < a.length; i++)
     {
       total += (double)(a[i]);
     }
     return (total/a.length); 
    }
  
    public static void main(String[] args)
     {
     int [] b = new int [] {1, 2, 3};
     average(b);
    }
}