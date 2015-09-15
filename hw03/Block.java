//Emily Wilkinson
//CSE2 Fouh
//9/14/15

//prompt for length width height of block
//calc volume of block and SA

//import scanner
import java.util.Scanner;

//define class
public class Block{
    
//add main method
    public static void main (String[] args){
        
//user input
    Scanner input = new Scanner (System.in);
    System.out.print(" Enter the length of the block: ");
    double length = input.nextDouble();
    
    System.out.print(" Enter the width of the block: ");
    double width = input.nextDouble();
    
    System.out.print(" Enter the height of the block: ");
    double height = input.nextDouble();
    
    double volume;
    double surfaceArea;
    
    volume = length*width*height;
    surfaceArea = 2*(length*width+length*height+width*height);
    
//calcs

//output
    System.out.println(" The volume of the block of dimensions "+length+" x "
    +width+" x "+height+" is "+volume+".");
    System.out.println(" The surface area of the block is "+surfaceArea);
    
    }//end main method
}//end class