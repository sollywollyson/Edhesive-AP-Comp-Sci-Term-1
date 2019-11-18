import java.util.Scanner;

class Lesson_33_Activity_Four {
  
    public static void reverse(int arr [])
    {
      int tempArr [] = new int [arr.length];
      int p  = 0;
      for(int i = arr.length - 1; i > -1; i--)
      {
        tempArr[p] = arr[i];
        p++;
      }
      for(int c = 0; c < arr.length; c++)
      {
        arr[c] = tempArr[c];
      }
    }

    public static void main(String[] args)
    {
     int Array [] = new int [] {1,2,3,4,5,6};
     reverse(Array);
    }
}