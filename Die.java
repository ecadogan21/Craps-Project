
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;  
import java.util.Random;
public class Die
{
    public int die1;   
    public int die2;

    
    public Die()
    {
        
        
    }

    
    public void roll()
    {
       die1 = (int)(Math.random()*6) + 1;
       die2 = (int)(Math.random()*6) + 1;
        
       
    }
    
             
           public int getDie1() 
        {
             
           return die1;
        }
        
        public int getDie2() 
        {
             
           return die2;
        }
        
        public int Total() 
        {
              
           return die1 + die2;
        }
}
