
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;  
import java.util.Random;
public class Craps
{
    

     public static void main(String[] args)
    {
        Die dice; 
        dice= new Die();
        Die  dice2;
        dice2 =new  Die();
        
        
         while(true){
        Scanner in = new Scanner(System.in);
       
        System.out.println("Would you like to read the instructions? y/n");
        String answer = in.nextLine();
        if (answer.equals("y"))
        {
          System.out.println("1. Roll two six-sided dice.");
          System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
          System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
          System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
          System.out.println("3. Keep rolling the dice again until:");
          System.out.println("4. a. You roll the point again and win!");
          System.out.println("4. b. or you roll a 7 and lose.");
          
          
            
        }
        System.out.println("Would you like to play? y/n");
        String response = in.nextLine();
        if(response.equals("y"))
        {
            System.out.println("Press Enter to roll:");
            String enter = in.nextLine();
            if (enter.equals(""))
            {
            dice.roll();
             }
            System.out.println( "Your Roll:" + dice.Total());
                if (dice.Total()==7 || dice.Total()==11)
                {
                System.out.println("You win!");
                }
                else if (dice.Total()==2 || dice.Total()==3 || dice.Total()==12)
                {
                System.out.println("You lose:(");
                 }
                 else
                {
              int point = dice.Total();
              System.out.println("Thats your point");
              System.out.println("Press Enter to roll:");
              String input = in.nextLine();
               if (input.equals(""))
            {
                
                dice2.roll();
                System.out.println(dice2.Total());
            }
              while(dice2.Total()!= point && dice2.Total()!= 7)
              {
                System.out.println("Press Enter to roll:");
                String num = in.nextLine();
                if (num.equals(""))
                {
                dice2.roll();
                System.out.println(dice2.Total());
                }
              }
              if (dice2.Total()==7)
            {
                System.out.println("You lose:(");
            }
             else if (dice2.Total()==point)
            {
                System.out.println("You win!");
            }
            
            }
        }
        System.out.println("Do you want to play again? (y/n)");
        String play = in.next();
       if (play.equals("n"))
        {
      System.out.println("Thank you for playing!");
      break;
    }
}   
        }
        
        
        
        
        
        
    }

