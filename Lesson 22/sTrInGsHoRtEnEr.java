import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the message to be shortened");
    String inputMsg = scan.nextLine();
    String buildMsg = "";
    int doubleLetter = 0;
    int vowel = 0;

    if (inputMsg.length() >= 10)
    {
      inputMsg = inputMsg.toLowerCase();
      for(int i = 0; i < (inputMsg.length()); i++)
      {

        //Adds the first letter, regardless.
        if (i == 0)
        {
          buildMsg = "" + inputMsg.substring(0,1);
        }

        //Auto adds character, vowel or not, if it follows a space (Start of word.)
        else if (inputMsg.charAt(i-1) == ' ')
        {
          buildMsg = buildMsg + inputMsg.charAt(i);
        }

        //Doesn't add if a double letter
        else if (inputMsg.charAt(i-1) == inputMsg.charAt(i) && 
                 (inputMsg.charAt(i) != 'a' && 
                  inputMsg.charAt(i) != 'e' && 
                  inputMsg.charAt(i) != 'o' && 
                  inputMsg.charAt(i) != 'u' && 
                  inputMsg.charAt(i) != 'i'))
        {
          doubleLetter++;
        }
        else
        {
          //Only adds character to final string if not a vowel.
          if (inputMsg.charAt(i) != 'a' && 
              inputMsg.charAt(i) != 'e' && 
              inputMsg.charAt(i) != 'o' && 
              inputMsg.charAt(i) != 'u' && 
              inputMsg.charAt(i) != 'i')
          {
            buildMsg = buildMsg + inputMsg.charAt(i);
          }
          else
          {
            vowel++;
          }
        }
      }
      System.out.println("Shortened message: " + buildMsg);
      System.out.println("Repeated letters removed: " + doubleLetter);
      System.out.println("Vowels removed: " + vowel);
      System.out.println("Total characters saved: " + (vowel + doubleLetter));
      
    }
    else if(inputMsg.length()<10)
    {
      //doesn't run word shortening if sentence is < 10 characters.
      System.out.println("This doesn’t need shortening!");
    }
  }
}