

package assignment2_10515117;

import java.util.Random;
import java.util.Scanner;
public class Number_guess_Q43 {
    public static void main(String[] nat){
    Random r = new Random();
    int rand = 1 +r.nextInt(10);
    Scanner num  = new Scanner(System.in);
    int guess;
    System.out.println("I'm thinking of a number from 1 to 10");
    System.out.print("Your guess: ");
     guess = num.nextInt();
     System.out.println();
     
     if (guess == rand)
         System.out.printf("That's right! My secrete number was %d %n ", rand);
     else 
         System.out.printf("Sorry, but I was really thinking of %d! %n",rand );
    
}
}
