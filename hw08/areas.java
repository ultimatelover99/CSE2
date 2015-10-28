//Emily Wilkinson
//CSE2 Fouh
//10/27/15

//method 1: take int argument = radius of circle. return area 
//method 2: takes 2 int arguments, lenght/width of rect. return area
//method 3: takes 3 ints, height, base 1, base 2, return area of trapezoid
//method 4: main method: ask user to enter shape. shape = circle, rect, or trap.
//ask user to enter values (length, wdith, base, etc)
//call appropriate area method, print result\
//keep asking user to select shape until valid option is selected
//also provide option to exit program.

//scanner class
import java.util.Scanner;

//class
public class areas{
    
//main method
    public static void main (String[] args){
        
    String quit = "N";
    Scanner input = new Scanner(System.in);
    System.out.println(" circle = 1; rectangle = 2; trapezoid = 3 ");
    System.out.print(" Exit program? Enter 'Y' or 'N': ");
    quit = input.nextLine();
    
    while(quit.equals("N")){
        System.out.print(" Enter a number for a shape: ");
        int shape = input.nextInt();
        while(shape != 1 && shape != 2 && shape != 3){
            System.out.print("Invalid entry. Enter again: ");
            shape = input.nextInt();
        }//end while
        if (shape==1){
            System.out.print(" Enter radius: ");
            int a = input.nextInt();
            System.out.println(" The area of the circle is: "+area(a));
            break;
        }//end if
        else if (shape==2){
            System.out.print("Enter length, then width: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(" The area of the rectangle is: "+area(a,b));
            break;
        }//end else if
        else if(shape==3){
            System.out.print("Enter height, base 1, and base 2: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println(" The area of the trapezoid is: "+area(a,b,c));
            break;
        }//end else if
    }//end while
    }//end main
    
//method area 1
    public static int area(int a){
        double PI = 3.14159;
        double preArea = PI*(a*a);
        int area= (int) preArea;
        return area;
    }//end area 1

//method area 2
    public static int area(int a, int b){
        int area = a*b;
        return area;
    }//end area 2

//method area 3
    public static int area(int a, int b, int c){
        int area = a*((b+c)/2);
        return area;
    }//end area 3
}//end class