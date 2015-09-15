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
    double dinnerTime = input.nextInt();
    
//calcs
    currentTime /= 100.0;
    dinnerTime /=100.0;
    
    double hey = Math.round(currentTime*100)/100.0;
    System.out.println(hey);
    
    }//end main method
}//end class