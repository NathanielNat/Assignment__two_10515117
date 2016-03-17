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

import java.util.Random;
public class ShorterDoubleDice_Q58 {
    public static  void main(String[] args){
        Random r = new Random();
        int rand1, rand2,sum;
        
        System.out.println("HERE COMES THE DICE");
        rand1 = 1 + r.nextInt(6);
        rand2 = 1 + r.nextInt(6);
        
        
       do{
            rand1 = 1 + r.nextInt(6);
            rand2 = 1 + r.nextInt(6);
            System.out.println("Roll #1: " + rand1);
            System.out.println("Roll #2: " + rand2);
        
            sum  = rand1 +rand2;
            System.out.println("The total is "+ sum);
        }
        while(rand1 != rand2 );
}
}
