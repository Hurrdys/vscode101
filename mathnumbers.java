import java.lang.Math.*;
import java.util.Scanner;
public class mathnumbers {
  public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      System.out.println("Input a random number ");
      int number = reader.nextInt();
       
      if(number % 2 == 0) 
          System.out.println(number + " is even");
      else 
          System.out.println(number + " is odd");
        

      System.out.println(" ");
      System.out.println(" ");

      Scanner scanner = new Scanner(System.in);

      System.out.println("Input the first number in a range  ");
      int first = scanner.nextInt();
      
      System.out.println("Input the last number in a range  ");
      int last = scanner.nextInt();
      
      System.out.println(" ");
      System.out.println("The even numbers are : ");
      for (int i = first; i < last; i++) {
          if (i % 2 == 0) { 
              System.out.println(i);
          }
      }
  }
}

// I know that an even number can be divisable by 2 so if it can be, it s an even number. If it cant, its odd. 
//For the 0 part, I tried different even numbers like 2, but it dident work and I found that 0 works. 

// For second prgram: I used the for loop on w3 and did a lot of trial and air. Had to keep testing and chaning to see if it works.




//double x;
      //int y;
      //for (int i = 1; i < 21; i++) {
        //x = Math.pow(i, 2);
        //System.out.println("The number is  " + x); 
        //y = i * i;
        //System.out.println("The number is  " + y); 
        