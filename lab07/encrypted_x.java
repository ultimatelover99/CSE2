//Emily Wilkinson
//Fouh CSE2
//10/9/15

//print encrypted x using while loops
//ask input btwn 0-100. =size of square by # of stars

//import scanner
import java.util.Scanner;

//class
public class encrypted_x{
    
//main method
    public static void main (String [] args){
        
//user input
    Scanner input = new Scanner (System.in);
    System.out.print(" Enter number of stars: ");
    int stars = input.nextInt();
//validate input
    if (stars <0 || stars > 100){
        System.out.print(" Invalid input. Enter again: ");
        stars = input.nextInt();
    }//if
    else{
        for(int i=0;i<=stars;i++){
            for(int j=0;j<=stars;j++){
               if(j==i || i==(stars-j)){
                   System.out.print(" ");
               }//end if
               else{
                   System.out.print("*");
               }//end else
            }//end for
            System.out.println(" ");
        }//for
        
    }
    }//main method
}//class