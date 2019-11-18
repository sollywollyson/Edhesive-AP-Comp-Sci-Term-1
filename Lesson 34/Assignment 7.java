import java.util.Scanner;
import java.lang.Math;

class Main {
  
    public static String duplicate(String str)
    {
      int n = str.length();
      if(n % 2 == 0){
        n *= 2;
      }
      String fun = "";
      for(int i = 0; i < str.length(); i++){
        for(int p = 0; p < n; p++){
          fun += str.charAt(i);
        }
      }
      return fun;
    }
    
    public static boolean isEdhesivePalindrome(String str)
    {
      if((str.length() < 3) || (str.length() > 15))
      {
        return false;
      }
      else{
        str = str.toLowerCase();
        String [] change = new String [1];
        for(int s = 0; s < str.length(); s++)
        {
          if (str.charAt(s) == '4'){
            if(s == 0)
            {
              change[0] = "a";
            }
            else
            {
            change[0] = change[0] + "a";
            }
          }
          else if (str.charAt(s) == '3'){
            if(s == 0)
            {
              change[0] = "e";
            }
            else
            {
            change[0] = change[0] + "e";
            }
          }
          else if (str.charAt(s) == '0'){
            if(s == 0)
            {
              change[0] = "o";
            }
            else
            {
            change[0] = change[0] + "o";
            }
          }
          else{
            if(s == 0)
            {
              change[0] = str.substring(s,s+1);
            }
            else
            {
              change[0] = change[0] + str.substring(s,s+1);
            }
          }
        }
        int z = str.length() - 1;
        for(int y = 0; y < str.length(); y++){
          if(change[0].charAt(y) == change[0].charAt(z))
          {
            z = z - 1;
          }
          else
          {
            return false;
          }
        }
        return true;
      }
    }
    
    public static double numberScramble(double num)
    {
      if(num < 0)
      {
        System.out.println("The scrambled number is: " + 0.0);
      }
      num = Math.sqrt(((num+5.0)/2.0));
      System.out.println("The scrambled number is: " + num);
      return num;
    }
    
    public static void main(String[] args)
    {
      Scanner scan = new Scanner (System.in);
      System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
      String name = scan.nextLine();
      System.out.println("The duplicated String is: "+duplicate(name));
      System.out.println("");
      System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
      String pal = scan.nextLine();
      if(isEdhesivePalindrome(pal))
      {
        System.out.println("Nice, you found an Edhesive Palindrome!");
      }
      else
      {
        System.out.println("Too bad, that isn't an Edhesive Palindrome.");
      }
      System.out.println("Almost done! Please enter a number to scramble.");
      double number = scan.nextDouble();
      numberScramble(number);
    }
}