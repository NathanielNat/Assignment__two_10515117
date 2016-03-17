
package assignment2_10515117;

import java.util.Scanner;
public class Adding_Values_Q55 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int sum = 0, num;
        System.out.println("I will add up the numbers you give me");
        
        while (true){
            System.out.println("Number:");
            num  = n.nextInt();
            sum  = sum + num;
            System.out.println("The total so far is "+ sum);
            if(num == 0){
                break;
            }
        }
    } 
}
