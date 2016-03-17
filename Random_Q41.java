

package assignment2_10515117;

 import java.util.Random;
public class Random_Q41 {
    public static void main(String[] args){
    Random r = new Random();
    int x = 1 + r.nextInt(10);
    System.out.println("My random number is " + x);
    
    System.out.println("Here are some random numbers from 1 to 5");
    System.out.println( 3 + r.nextInt(5) + " ");
    System.out.println( 3 + r.nextInt(5) + " ");
    System.out.println( 3 + r.nextInt(5) + " ");
    System.out.println( 3 + r.nextInt(5) + " ");
    System.out.println( 3 + r.nextInt(5) + " ");
    System.out.println( 3 + r.nextInt(5) + " ");
    System.out.println();
    
    System.out.println("Here are some random numbers from 1 to 100!");
    System.out.println(1 + r.nextInt(100) + " \t");
    System.out.println(1 + r.nextInt(100) + " \t");
    System.out.println(1 + r.nextInt(100) + " \t");
    System.out.println(1 + r.nextInt(100) + " \t");
    System.out.println(1 + r.nextInt(100) + " \t");
    
    int num1  = 1 +r.nextInt(10);
    int num2 = 1 + r.nextInt(10);
    if (num1 == num2){
        System.out.print("The radom numbers were same! Wierd");
    }
    else {
        System.out.println("Random numbers were not same! Not too suprising, actually");
    }
    }
    
}


/// Q1 the random numbers included zero when 1+ was deleted

/// Q2  The code outputs numbers greater than or equal to 3

/// Q3 When the random number is set to (12345), constant values are being produced

