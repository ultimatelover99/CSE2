//Emily Wilkinson
//Fouh CSE2
//9/14/15

//prompt user  for current time and dinner time
//calc amt  time remaining until dinner
//use military time, input is HHMM

//import scanner
import java.util.Scanner;

//define class
public class Timer{
    
//add main method
    public static void main (String[] args){
        
//declare scanner
    Scanner input = new Scanner (System.in);
    
//user input
    System.out.print(" Enter the current time: ");
    double currentTime = input.nextInt();
    
    System.out.print("Enter the time that you will be eating dinner: ");
    int dinnerTime = input.nextInt();
    
//calcs
    currentTime /= 100.0;
    dinnerTime /=100.0;
    
    int currentTimeHour = (int)(currentTime/10)%10;
    int currentTimeMinutes = (int)(currentTime*10)%10;
    int dinnerTimeHour = (int)(dinnerTime/10)%10;
    int dinnerTimeMinutes = (int)(dinnerTime*10)%10;
    
    int hours = dinnerTimeHour - currentTimeHour;
    int minutes =10*(dinnerTimeMinutes = currentTimeMinutes);
    
    System.out.println(" You have "+hours+" hours and "+minutes+
    " minutes until dinner. ");
    
    }//end main method
}//end class