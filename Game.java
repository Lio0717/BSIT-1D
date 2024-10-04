import java.util.Scanner; 
public class Game {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int remainingAttempts = 5;
      String secretWord = "Hatdogs";

      System.out.println("Welcome to the Guessing Game");

      while (remainingAttempts > 0){
        System.out.println("What is the secret word?");
        String guess = sc.next();
    
      if (guess.equals(secretWord)){
        System.out.println("Correct Guess");
        break;
      } else {
        if (guess.length() > secretWord.length()){
            System.out.println("Too long");
        } else if (guess.length() < secretWord.length()){
            System.out.println("Too short");
        } else {
            System.out.println("Wrong word");
        }
      } remainingAttempts--;
      System.out.println("You have remaning" + remainingAttempts);
      }
      if (remainingAttempts == 0){
        System.out.println("You have no remaining attempts left");
      }
      System.out.println("Thank you for playing!");
      System.out.println();
    }
}
