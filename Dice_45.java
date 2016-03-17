

package assignment2_10515117;

import java.util.Random;
public class Dice_45 {
    public static void main(String[] args){
        Random r = new Random();
        int die1,die2,sum;
        System.out.println("HERE COMES THE DICE!");
        
        die1  = 1 + r.nextInt(6);
        die2  = 1 + r.nextInt(6);
        System.out.println("Roll #1: " + die1);
        System.out.println("Roll #2: " + die2);
        
        sum = die1 + die2;
        System.out.println("The total is " +sum +"!");
        
    }
}
