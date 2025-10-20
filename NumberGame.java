import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game ");
        int totalscore=0;
        String playAgain="yes";
        while(playAgain.equals("yes")){
            int attempts=0;
            int maxAttemps=5;
            boolean guessCorrectly=false;
            int rn=(int)(Math.random()*100)+1;
            System.out.println("The computer has generated a random number");
            System.out.println("You have "+maxAttemps+" attempts to guess it");
            while (attempts<maxAttemps && guessCorrectly==false) {
                System.out.println("Enter your guess : ");
                int userGuess=sc.nextInt();
                attempts++;
                if(userGuess==rn){
                    System.out.println("Correct! You have guessed it in "+attempts+" attempts");
                    guessCorrectly=true;
                    int roundScore=(maxAttemps-attempts+1)*10;
                    totalscore+=roundScore;
                    break;
                }else if(userGuess>rn){
                    if(userGuess-rn>=20){
                        System.out.println("Too high! Try again");        
                    }else if (userGuess-rn<20) {
                        System.out.println("A Bit High! Try again");
                    }
                }
                else{
                if(rn-userGuess>=20){
                    System.out.println("Too Low! Try again");        
                }else if (rn-userGuess<20) {
                    System.out.println("A Bit Low! Try again");
                    }
                }
            }
            if (guessCorrectly==false) {
                System.out.println("You've used all your attempts! The number was "+rn);                
            }
            System.out.println("You're total score : "+totalscore);
            System.out.println("Do you want to play again ?(yes/no)");
            sc.nextLine();
            String pa=sc.nextLine();
            if(pa.equals("yes")){
                playAgain="yes";
            }else{
                playAgain="no";
            }
        }
        System.out.println("Thanks for playing! Your final score : "+totalscore);
        sc.close();
    }
}
