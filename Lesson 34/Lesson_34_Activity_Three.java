import java.util.Scanner;

class Lesson_34_Activity_Three {
  
   public static int findMax(int [] a)
    {
    int max = a[0];
    for(int i = 1; i < a.length; i++)
    {
      if(max < a[i])
      {
        max = a[i];
      }
    }
    return max; 
    }
  
    public static void main(String[] args)
    {
     int [] b = new int [] {1, 2, 3, 4, 5, 7, 6};
     findMax(b);
    }
}