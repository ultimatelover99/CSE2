//Emily Wilkinson
//Fouh CSE2
//9/18/15

//switch statement , prompt for 2 integers and operator. 
//display illegal operator if operator is invalid

//import java
import java.util.Scanner;

//define class
public class Calculator{
    
//add main method
    public static void main(String[] args){
        
//declare scanner
    Scanner input = new Scanner (System.in);

//declare input
    char operator;
    
//user input
    System.out.print(" Enter first integer: ");
    int a = input.nextInt();
    
    System.out.print(" Enter second integer: ");
    int b = input.nextInt();
    
    System.out.print(" Enter an operator: ");
    operator = input.next().charAt(0);
    
    int numOperator = 0;
    if(operator == '+'){
        numOperator = 1;
    }//end if
    else if(operator == '-'){
        numOperator = 2;
    }//else if
    else if(operator == '/'){
        numOperator = 3;
    }//end else if 
    else if(operator == '*'){
        numOperator = 4;
    }//end else if
    else{
        System.out.println(" Illegal operator. ");
    }//end else if 
    
//switch statement
    int answer;
    switch (numOperator){
        case 1: 
            answer = a+b;
            System.out.println(" a+b= "+answer);
            break;
        case 2:
            answer = a-b;
            System.out.println(" a-b= "+answer);
            break;
        case 3:
            answer = a/b;
            System.out.println(" a/b= "+answer);
            break;
        case 4:
            answer = a*b;
            System.out.println(" a*b= "+answer);
            break;
        default:
            break;
    }//end switch
    
    }//end main method
}//end class