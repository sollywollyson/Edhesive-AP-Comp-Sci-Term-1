import java.util.Scanner;

class Lesson_33_Activity_One {
  
    public static void upper(String arr [])
    {
       for(int i = 0; i < arr.length; i++)
       {
         arr[i] = arr[i].toUpperCase();
       }
    }
  
    public static void main(String[] args)
     {
      String [] arrTest = {"solomon","pryce","edward","aahron"};
      upper(arrTest);
    }
}