import java.util.Scanner;

class Lesson_34_Activity_One {
  
   public static int sum(int [] ArrB)
   {
    int total = 0;
    for(int i = 0; i < ArrB.length; i++)
    {
      total += ArrB[i];
    }
     return total; 
   }
  
    public static void main(String[] args)
    {
      int [] ArrA = new int [] {1, 2, 3};
      sum(ArrA);
    }
}