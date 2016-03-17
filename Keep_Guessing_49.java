

package assignment2_10515117;

import java.util.Scanner;
import java.util.Random;
public class Keep_Guessing_49 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        Random r = new Random();
        int rand,choice;
        rand  = 1+ r.nextInt(10);
        
        System.out.println("I'm thinking of number from  to 10");
        System.out.println("Your guess: ");
        choice  = num.nextInt();
        while(choice!= rand){
            System.out.println("That is incorrect. Guess agin.");
            System.out.println("Your guess: ");
        choice  = num.nextInt();
        }
        System.out.println("That's right you are a good guesser");
        
    }
}
