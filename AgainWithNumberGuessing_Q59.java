/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10515117;

/**
 *
 * @author The Nat
 */
import java.util.Scanner;
import java.util.Random;
public class AgainWithNumberGuessing_Q59 {
     public static void main(String[] args){
        Scanner num  = new Scanner(System.in);
        Random r  = new Random();
        
        int rand = 1 +r.nextInt(10);
        int guess,nt = 1;
        System.out.println("I have a number between 1 and 10. Try to guess it.");
        System.out.println("Your guess");
        guess = num.nextInt();
         do{
             System.out.println("That's incorrect. Guess again ");
              System.out.println("Your guess: ");
              guess = num.nextInt();
              nt ++;
         }
         while(guess!=rand);
         System.out.println("Thats right! You are a good guesser.");
         System.out.println("It only took you " + nt + " times");
         }
}
