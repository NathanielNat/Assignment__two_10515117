

package assignment2_10515117;

import java.util.Random;

public class Fortune_cookie_Q44 {
   public static void main(String[] nat){
       Random r = new Random();
       
       int rand1 = 1 + r.nextInt(54);
       int rand2 = 1 + r.nextInt(54);
       int rand3 = 1 + r.nextInt(54);
       int rand4 = 1 + r.nextInt(54);
       int rand5 = 1 + r.nextInt(54);
       int rand6 = 1 + r.nextInt(54);
		
       int fortune_num = 1 + r.nextInt(10);
       String cookie_reply;
	
       if ( fortune_num== 1 )
	 cookie_reply = "Life is going to be great.";
       else if ( fortune_num == 2 )
	  cookie_reply = "Smile! And stop frowning";
       else if ( fortune_num == 3 )
	  cookie_reply = "Better days to come.";
       else if ( fortune_num == 4 )
	  cookie_reply = "You are allergic to pizza.";
       else if ( fortune_num == 5)
	  cookie_reply = "Learn for six hours a day.";
       else if ( fortune_num == 6 )
           cookie_reply = "You have no a nice car...";
       else if ( fortune_num == 7 )
           cookie_reply = "You have no manners...";
       else if ( fortune_num == 8 )
           cookie_reply = "Eat twice daily...";
       else if ( fortune_num == 9 )
           cookie_reply = "Give cheerfully...";
       else if ( fortune_num == 10 )
           cookie_reply = "God is love...";
       
       else
           cookie_reply = "Never date your enemy!";
		
       System.out.println( " Fortune cookie says: " + cookie_reply );
       System.out.println( "\t" + rand1 + " - " + rand2 + " - " + rand3 + " - " + rand4+ " - " + rand5+ " - " + rand6); 
       
   }
}
