//Emily Wilkinson
//Fouh CSE2
//10/15/15

//main program calls 3 methods
//mean method
//median method
//void print method, prints results

import java.util.Scanner;

import java.util.Arrays;

//class
public class methods{
    
    public static void main (String [] args){
        
    Scanner input = new Scanner(System.in);

    System.out.print(" Enter a number: ");
    int n1 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n2 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n3 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n4 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n5 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n6 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n7 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n8 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n9 = input.nextInt();
    
    System.out.print(" Enter a number: ");
    int n10 = input.nextInt();
    
    System.out.println(mean(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10));
    System.out.println(median(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10));
    }//end main method
    
//mean method
    public static double mean(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10){
        int sum = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
        double mean = sum/10;
        return mean;
    }//end mean method
    
//median method
    public static double median(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10){
        int temp;
        if(n1>n2){ temp=n1; n1=n2; n2=temp;}//end if
        if(n1>n3){ temp=n1; n1=n3; n3=temp;}//end if
        if(n1>n4){ temp=n1; n1=n4; n4=temp;}//end if
        if(n1>n5){ temp=n1; n1=n5; n5=temp;}//end if
        if(n1>n6){ temp=n1; n1=n6; n6=temp;}//end if
        if(n1>n7){ temp=n1; n1=n7; n7=temp;}//end if
        if(n1>n8){ temp=n1; n1=n8; n8=temp;}//end if
        if(n1>n9){ temp=n1; n1=n9; n9=temp;}//end if
        if(n1>n10){ temp=n1; n1=n10; n10=temp;}//end if
        
        if(n2>n3){ temp=n2; n2=n3; n3=temp;}//end if
        if(n2>n4){ temp=n2; n2=n4; n4=temp;}//end if
        if(n2>n5){ temp=n2; n2=n5; n5=temp;}//end if
        if(n2>n6){ temp=n2; n2=n6; n6=temp;}//end if
        if(n2>n7){ temp=n2; n2=n7; n7=temp;}//end if
        if(n2>n8){ temp=n2; n2=n8; n8=temp;}//end if
        if(n2>n9){ temp=n2; n2=n9; n9=temp;}//end if
        if(n2>n10){ temp=n2; n2=n10; n10=temp;}//end if
        
        if(n3>n4){ temp=n3; n3=n4; n4=temp;}//end if
        if(n3>n5){ temp=n3; n3=n5; n5=temp;}//end if
        if(n3>n6){ temp=n3; n3=n6; n6=temp;}//end if
        if(n3>n7){ temp=n3; n3=n7; n7=temp;}//end if
        if(n3>n8){ temp=n3; n3=n8; n8=temp;}//end if
        if(n3>n9){ temp=n3; n3=n9; n9=temp;}//end if
        if(n3>n10){ temp=n3; n3=n10; n10=temp;}//end if
        
        if(n4>n5){ temp=n4; n4=n5; n5=temp;}//end if
        if(n4>n6){ temp=n4; n4=n6; n6=temp;}//end if
        if(n4>n7){ temp=n4; n4=n7; n7=temp;}//end if
        if(n4>n8){ temp=n4; n4=n8; n8=temp;}//end if
        if(n4>n9){ temp=n4; n4=n9; n9=temp;}//end if
        if(n4>n10){ temp=n4; n4=n10; n10=temp;}//end if
        
        if(n5>n6){ temp=n5; n5=n6; n6=temp;}//end if
        if(n5>n7){ temp=n5; n5=n7; n7=temp;}//end if
        if(n5>n8){ temp=n5; n5=n8; n8=temp;}//end if
        if(n5>n9){ temp=n5; n5=n9; n9=temp;}//end if
        if(n5>n10){ temp=n5; n5=n10; n10=temp;}//end if
        
        if(n6>n7){ temp=n6; n6=n7; n7=temp;}//end if
        if(n6>n8){ temp=n6; n6=n8; n8=temp;}//end if
        if(n6>n9){ temp=n6; n6=n9; n9=temp;}//end if
        if(n6>n10){ temp=n6; n6=n10; n10=temp;}//end if

        if(n7>n8){ temp=n7; n7=n8; n8=temp;}//end if
        if(n7>n9){ temp=n7; n7=n9; n9=temp;}//end if
        if(n7>n10){ temp=n7; n7=n10; n10=temp;}//end if
        
        if(n8>n9){ temp=n8; n8=n9; n9=temp;}//end if
        if(n8>n10){ temp=n8; n8=n10; n10=temp;}//end if
        
        if(n9>n10){ temp=n9; n9=n10; n10=temp;}//end if

        double middle = n5+n6;
        double median = middle/2;
        return median;
        
    }//end median method
}//end class
