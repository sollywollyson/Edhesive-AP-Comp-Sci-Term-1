import java.util.Scanner;

class Lesson_33_Activity_Three {
  
    public static void printit(int arr [])
    {
      for(int i  = 0; i < arr.length; i++){
        System.out.print(arr[i]);
        if(i != arr.length - 1)
        {
          System.out.print(" ");
        }
      }
    }
    
    public static void main(String[] args)
     {
      int Array [] = new int [] {1,2,3,4,5,6,7,8};
      printit(Array);
    }
}