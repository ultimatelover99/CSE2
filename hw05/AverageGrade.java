//Emily Wilkinson
//Fouh CSE2
//9/28/15

//use while statement that continually requests a grade to be entered
//if grad <0 or >100, program displays invalid grade
//valid grade is added to a variable storing the total of grades entered
//when a grade of 999 is entered, program should exit while loop and compute
//and display average of valid grades entered

//import scanner
import java.util.Scanner;

//define class
public class AverageGrade{
    
//add main method
    public static void main (String [] args){
        
//declare variables
    int cumulative=0;
    int grade;
    int average=0;
    int numberGrades=0;
    
//while loop asking for grade entry
    while(cumulative<=999){
        
//user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade: ");
        grade=input.nextInt();
        
//checking if grade is valid, add grade to cumulative
        
        if(grade<0 || grade >100){
            System.out.println(" Invalid grade entry. ");
        }//end if
        else{
//taking cumulative
            cumulative=cumulative+grade;
//tallying number of grades entered
            numberGrades++;
        }//end else
//calculate/display average of all grades
        average=cumulative/numberGrades;
        System.out.println(average);
    }//end while
    }//end main method
}//end class