/* Lab4
Jason Morgner, Griffin Star, Kiley Hardcorn
2/6/2021
*/

import java.util.Random;
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    Random r = new Random();
       int randomNum = r.nextInt(51) + 0;
      
      
    System.out.println("The random number is:" + randomNum + "!");
    if (randomNum > 0)
      for (int count = randomNum; count >= 0; count--) {
        System.out.println(count);
      }

     if (randomNum <= 5) {
       System.out.println("Ahoy mateys!");
     }  
     if (25 < randomNum && randomNum < 42 ){
       System.out.println("CannonBall!");
     }
      else {
        System.out.println("Blast Off!");
      }
  }
}
