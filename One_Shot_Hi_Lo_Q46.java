

package assignment2_10515117;

import java.util.Scanner;
import java.util.Random;
public class One_Shot_Hi_Lo_Q46 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner ent = new Scanner(System.in); 
        int rand,num;
        rand  = 1 + r.nextInt(100);
        System.out.println("Try to get into my head!! Which number am I thinking about?");
        num  = ent.nextInt();
        if (rand == num)
            System.out.println("Such a genius! How did you do that?");
        else if (rand > num)
            System.out.println("You are thinking too far, come down a little bit");
        else
            System.out.println("Ooops! that's too low. Try again");
    }
}
