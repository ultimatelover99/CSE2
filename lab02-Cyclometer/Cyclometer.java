//Emily Wilkinson
//8/28/15
//Fouh CSE2
//
//create cyclometer that records:
//  1. time elapsed (sec)
//  2. # of rotations of wheel. 
//print the number of minutes for each trip
//print the number of counts for each tirp
//print the distance of each trip in miles
//print the distance for the two trips combined

//define class
public class Cyclometer {
    
//add main method
    public static void main (String[] args){
        
//input variables
    int secsTrip1 = 480;
    int secsTrip2 = 3220;
    int countsTrip1 = 1561; //# rotations Trip 1
    int countsTrip2 = 9037; //# rotations Trip 2
    
//constants
    double wheelDiameter = 27.0,
    PI = 3.14159,
    feetPerMile = 5280,
    inchesPerFoot = 12,
    secondsPerMinute = 60;
    double distanceTrip1, distanceTrip2, totalDistance;

//print Trip times
    System.out.println(" Trip 1 took "+(secsTrip1/secondsPerMinute)+
    " minutes and had "+countsTrip1+" counts. ");
    System.out.println(" Trip 2 took "+(secsTrip2/secondsPerMinute)+
    " minutes and had "+countsTrip2+" counts. ");
    
//compute distances

    distanceTrip1 = countsTrip1*wheelDiameter*PI; //dist in inches
    distanceTrip1 /= inchesPerFoot*feetPerMile; //dist in miles
    distanceTrip2 = countsTrip2*wheelDiameter*PI; //dist in inches
    distanceTrip2 /= inchesPerFoot*feetPerMile; //dist in miles
    totalDistance = distanceTrip1+distanceTrip2;

//print distances
    System.out.println(" Trip 1 was "+distanceTrip1+" miles. ");
    System.out.println(" Trip 2 was "+distanceTrip2+" miles. ");
    System.out.println(" The total distance was "+totalDistance+" miles. ");
    
    }//end main method
}//end class