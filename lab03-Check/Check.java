//Emily Wilkinson
//Fouh CSE2
//9/11/15

//user input=check cost, desired tip, # ways check splits
//how much does each person need to pay

//import scanner
import java.util.Scanner;

//define class
public class Check{
    
//add main method
    public static void main (String [] args){
    
//user input (check cost before tip)
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter the original cost of the check in the form XX.XX: ");
    double cost = input.nextDouble();

//user input (desired tip)
    System.out.print("Enter the % tip that you wish to pay as a whole number (in the form XX): ");
    double tipPercent = input.nextDouble();
   
//user input (splitting check)
    System.out.print("Enter the # of ways you wish to split the check: ");
    int nPeople = input.nextInt();
    
//converting into decimal
    tipPercent /=100;
    
//calculations
    double totalCost;
    double costPerPerson;
    
    totalCost = cost*(1+tipPercent);
    costPerPerson = totalCost/nPeople;
    
    costPerPerson = Math.round(costPerPerson*100.0)/100.0;
    System.out.println(" Each person pays $"+costPerPerson);
    
}//end main method
}//end class
