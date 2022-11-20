/* This program was done by 21/04321- Job Gabriel
Question 2: Task two
*/ 
package marks;

import java.util.Scanner;



public class grade {
    // variables are declared here
   static int java;
   static int networking;
    static int maths;
    static int sum;
    static int average;
    //The main method is created here
   public static void grade() {
       //Create an object scanner
    Scanner input= new Scanner (System.in);
    //Asks the user to enter the marks for java
    System.out.println("Enter the marks for java programming:");
    java = input.nextInt();
    //Asks the user to enter the marks for networking
    System.out.println("Enter the marks for networking:");
    networking = input.nextInt();
    //Asks the user to enter the marks for maths
    System.out.println("Enter the marks for maths:");
    maths = input.nextInt();
    //sum of the marks are performed
    sum = java + networking + maths ;
    //average of the marks are performed
    average = sum/3;
    //displays the average grade
    System.out.println(" The average is:"+ average);
}
    public static void main(String[] args) {
        //displays the data of the main method
        grade();
        
    }
}  

