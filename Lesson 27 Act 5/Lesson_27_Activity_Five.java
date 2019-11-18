import java.util.Scanner;
import java.lang.Math; 

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    String thing = "{";
    System.out.println("How long do you want the array?");
    int arrLength = scan.nextInt();
    double arr[];
    double avg = 0.0;
    double range;
    boolean increasing = false;
    boolean decreasing = false;
    double high = -999.0;
    double low = 999.0;
    if(arrLength > 0)
    {
      arr = new double[arrLength];
      for(int i = 0; i < arrLength; i++){
        System.out.println("Enter a number:");
        arr[i] = scan.nextDouble();
      }
      for(int k = 0; k < arrLength; k++){
        thing = thing + arr[k];
        if(k<arrLength-1){
           thing = thing + ", "; 
        }
      }
      thing = thing + "}";
      System.out.println("Your array is " + thing);
      for(int j = 0; j < arrLength; j++){
        avg = avg + arr[j];
        if(j == arrLength - 1){
          avg = avg / arrLength;
        }
      }
      System.out.println("The average is " + avg);
      high = arr[0];
      low = arr[0];
      for(int z = 0; z < arrLength - 1; z++){
        if(arr[z+1] > arr[z] && arr[z+1] > high)
        {
          high = arr[z+1];
        }
        if(arr[z+1] < arr[z] && arr[z+1] < low)
        {
          low = arr[z+1];
        }
      }
      range = high - low;
      System.out.println("The range is " + range);
      for(int n = 1; n < arrLength; n++){
        if(arr[n] >= arr[n-1]){
          increasing = true;
        }
        if(arr[n] < arr[n-1]){
          decreasing = true;
        }
      }
      if(increasing && !decreasing){
        System.out.println("The array is sorted in increasing order");
      }
      if(decreasing && !increasing){
        System.out.println("The array is sorted in decreasing order");
      }
      if(increasing && decreasing){
        System.out.println("The array is unsorted");
      }
    }
    else
    {
      System.out.println("Not a valid length!");
    }
}
}