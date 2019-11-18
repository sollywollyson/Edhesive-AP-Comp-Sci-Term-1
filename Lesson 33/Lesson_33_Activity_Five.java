import java.util.Scanner;

class Lesson_33_Activity_Five {
  
    public static void insertValue(int arr [], int a, int b)
    {
      int temp = arr[b];
      for(int i = arr.length - 1; i > b; i--)
      {
        arr[i] = arr[i - 1];
      }
      arr[b] = a;
    }
  
    public static void main(String[] args)
    {
     int Array [] = new int [] {1,2,3,4,5};
     insertValue(Array, 100, 2);
    }
}