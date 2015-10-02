//Emily Wilkinson
//Fouh CSE2
//10/1/15

//ask user for non-neg. int =#employees. ask for data for each worker
//first data=input pay per hour
//second data=5 ints representing # hours worked on each day of work week
//write loop and code that reads data, stores total payroll 
//  needs to add #s worked by each employee
//  multipy #s by each employees pay rate=pay for week
//  sum everything to total -print payroll for all employees

//import scanner
import java.util.Scanner;

//class
public class TimeSheets{
    
//add main method
    public static void main (String[] args){
        
//variables
    int counter=0;
    
//user input #employees
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter a non-negative number of employees: ");
    int nEmployees = input.nextInt();
    
    int payPerHr = 0;
    int MonHrs = 0;
    int TuesHrs = 0;
    int WedHrs = 0;
    int ThursHrs = 0;
    int FriHrs = 0;
    int payroll = 0;
    int totalPayroll = 0;
    int sum = 0;
    
    if (nEmployees < 0){
        System.out.println(" Invalid entry. ");
    }//end if
    else{
        for(int i=1; i<=nEmployees;i++){
           System.out.print("Enter pay per hour of employee: ");
           payPerHr = input.nextInt();
           for(int j=0; j<1;j++){
               System.out.print(" How many hours did you work on Monday: ");
               MonHrs = input.nextInt();
           }//end for
           for(int j=0; j<1;j++){
               System.out.print("How many hours did you work on Tuesday: ");
               TuesHrs = input.nextInt();
           }//end for
           for(int j=0; j<1;j++){
               System.out.print("How many hours did you work on Wednesday: ");
               WedHrs = input.nextInt();
           }//end for
           for(int j=0; j<1;j++){
               System.out.print("How many hours did you work on Thursday: ");
               ThursHrs = input.nextInt();
           }//end for
           for(int j=0; j<1;j++){
               System.out.print("How many hours did you work on Friday: ");
               FriHrs = input.nextInt();
           }//end for
           sum = MonHrs+TuesHrs+WedHrs+ThursHrs+FriHrs;
           payroll = sum*payPerHr;
           System.out.println(payroll);
           totalPayroll += payroll;
            System.out.println(totalPayroll);
        }//end for
       
    }//end else
    

    

    
    }//end main method
}//end class