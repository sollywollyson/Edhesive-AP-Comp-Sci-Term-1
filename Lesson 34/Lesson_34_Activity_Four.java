import java.util.Scanner;

class Lesson_34_Activity_Four {
  
   public static int findMin(int [] a)
    {
     int min = a[0];
     for(int i = 1; i < a.length; i++)
     {
       if(min > a[i])
       {
         min = a[i];
       }
     }
      return min; 
    }
  
    public static void main(String[] args)
    {
      int [] b = new int [] {1, 2, 3, 5, -5, 3, -1};
      findMin(b);
    }
}
