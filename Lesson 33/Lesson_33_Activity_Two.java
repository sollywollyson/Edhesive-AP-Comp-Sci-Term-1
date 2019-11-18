import java.util.Scanner;

class Lesson_33_Activity_Two {
  
    public static void randomize(int arr [])
    {
      for(int i = 0; i < arr.length; i++)
      {
        arr[i] = (int)(Math.random()*90 + 10);
      }
    }
  
    public static void main(String[] args)
     {
      int [] arrTest = new int [] {1,2,3,4,5,6,7,8,9};
      randomize(arrTest);
    }
}