//Emily Wilkinson
//CSE2 Fouh
//10/5/15

//using loops, ask user size of pyramid to display, print pyramid

//scanner
import java.util.Scanner;

//class
public class pyramid {
    
//main method
    public static void main (String [] args){
        
//user input
    Scanner input = new Scanner (System.in);
    System.out.print(" What size pyramid? ");
    int size = input.nextInt();
    int depth=size;
    
//for loop
    for (int i=0; i<=size;i++){
        System.out.println(" ");
        for(depth=size; depth>0; depth--){
            System.out.print(" ");
        }//end for
        for(int k=0; k<i;k++){
            System.out.print(" *");
        }//end for
        
    }//end for
       // System.out.print(" ");
    System.out.println(" ");
    }//end main method
}//end class