//Emily WIlkinson
//CSE2 FOuh
//10/29/15

//ask user  for number of values to be stored in array of ints 
//create array of size n
//use for loop to initialize array with n random #s btwn 0-100
//for loop to iterate through array and print all values
//for loop to find sum of values in array and print avg
//put avg in variable
//for loop to print values >=to avg

//import scanner
import java.util.Scanner;

//class
public class arrays{
    
//main method
    public static void main (String[] args){
        
//ask user input
    Scanner input = new Scanner (System.in);
    System.out.print(" Enter number of values to be stored in array: ");
    int n = input.nextInt();
    
    int [] arr = new int [n];
    double[] arrayAvg = new double [n];
    
//initialize and declare variables
    int i=0;
    int sum = 0;
    double avg = 0;
//initialize array w/ random #s, print
    for ( ; i<n;i++){
        arr[i]= (int)(Math.random()*100);
        System.out.println(" arr["+i+"] = "+arr[i]);
        
//sum of values, print avg
        // for(int j = 0; j<n;j++){
        //     sum += arr[i];
        //     avg = sum/n;
        // }//end for
        sum += arr[i];
        avg = sum/n;
        
    System.out.println(" Sum of the values in the array = "+sum);
  
    }//end for
 System.out.println(" Average of the values in the array = "+avg);

//print variables >=avg
    for (int k = 0; k<n; k++){
        if (arr[k] >= avg){
            System.out.println(arr[k]);
        }//end if
    }//end for
    }//end main method
}//end class