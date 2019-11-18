import java.util.Scanner;

class Lesson_34_Activity_Six {
  
  public static boolean allPositive(int [] a)
    {
    int count = 0;
    for(int i = 0; i < a.length; i++)
    {
      if(a[i] >= 0)
      {
        count += 1;
      }
    }
    if(count == a.length)
    {
      return true;
    }
    else{
      return false;
    }
    }
  
    public static void main(String[] args)
    {
     int [] b = new int [] {1, 2, 3, 1, 6, 7};
     allPositive(b);
    }
}