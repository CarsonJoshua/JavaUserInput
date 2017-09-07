import java.util.Scanner;
/**
*Class for getting user input mostly
*@author Josh Carson
*@version 0.1
*2017-09-07
*/
public class UInput{
   private static Scanner keyboard = new Scanner(System.in);

   public static String getString(String prompt){
      System.out.println(prompt);
      return keyboard.next();
   }
   public static String getString(){
      return getString("Input String:");
   }
   
   public static int getInt(){//ALL the getInt methods don't validate input
      return keyboard.nextInt();
   }
   public static int getInt(int minIncl, int maxIncl){
      int in = keyboard.nextInt();
      while(in < minIncl || in > maxIncl){
         System.out.println("Enter a number between " + minIncl + " and " + maxIncl);
         in = keyboard.nextInt();
      }
      return in;
   }
   public static int getInt(int minIncl, boolean dummy){
      return getInt(minIncl, Integer.MAX_VALUE);
   }
   public static int getInt(boolean dummy, int maxIncl){
      return getInt(Integer.MIN_VALUE, maxIncl);
   }

}