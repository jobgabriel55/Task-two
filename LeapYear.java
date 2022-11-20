/* This program was done by 21/04321- Job Gabriel
Question 3: Task two
*/ 
package leap.year;

import java.util.Scanner;


public class LeapYear {
    // declaration of variables
static int year;
   
    public static void main(String[] args) {
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        //Ask the user to enter the year
        System.out.println("Please enter the year:");
        year = input.nextInt();
        // if the year is divisible by 4 then its a leap year if not then its not a leap year
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(year+ " is a leap year");
        else
            System.out.println(year+ " is not a leap year");
            
    }
    
}
