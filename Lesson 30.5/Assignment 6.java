import java.util.Scanner;
import java.lang.Math; 
class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int length1 = -1;
    while(length1 < 10)
    {
      System.out.println("Enter an array length (must be 10 or greater)");
      length1 = scan.nextInt();
    }
    int arr1 [] = new int [length1];
    int arr2 [] = new int [length1];
    for(int a = 0; a < length1; a++)
    {
      if(a == 0){
        System.out.print("First Array:");
      }
      arr1[a] = (int)(Math.random() * 100 + 1);
      System.out.print(" " + arr1[a]);
    }
    for(int b = 0; b < length1; b++)
    {
      if(b == 0){
        System.out.println("");
        System.out.print("Second Array:");
      }
      arr2[b] = (int)(Math.random() * 100 + 1);
      System.out.print(" " + arr2[b]);
    }
    int c  = length1 * 2;
    int count = 0;
    int z = 0;
    int mergeArr [] = new int [c];
    while(z < c)
    {
      mergeArr[z] = arr1[count];
      mergeArr[z+1] = arr2[count];
      count++;
      z+=2;
    }
    //Take each number and start looping from behind
    //in order to find repeats to rearrange the indexes forward
    //and replace ending elements with zeros (dont question the names of my variables here)
    for(int flip = 0; flip < c; flip++) //forwards loop
    {
      for(int sake = c - 1; sake > 0; sake--) //backwards loop
      {
        //make sure the the loop doesnt take out that flip value when sake overruns it
        if((mergeArr[flip] == mergeArr[sake]) && (flip != sake)){
          for(int cup = sake; cup < c; cup++)
          {
            if(cup == c - 1){
              mergeArr[cup] = 0;
            }
            else{
              mergeArr[cup] = mergeArr[cup+1];
            }
          }
        }
      }
    }
    //print the merged array BUT dont forget to exclude the zeros
    for(int shoot = 0; shoot < c; shoot++)
    {
      if(shoot == 0)
      {
        System.out.println("");
        System.out.print("Merged Array:");
      }
      if(mergeArr[shoot] != 0){
        System.out.print(" " + mergeArr[shoot]);
      }
    }
  }
}