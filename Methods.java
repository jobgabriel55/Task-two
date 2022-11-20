/* This program was done by 21/04321- Job Gabriel
Question one: Task two
*/ 
package methods;

import java.util.Scanner;


public class Methods {
    //Declaring variables
    static int num1;
 static int num2;
 static int num3;
  static int largest, smallest;
  public static void Methods(){
      //Creating object scanner
Scanner input = new Scanner(System.in);
//Ask the user to enter the first number
        System.out.println("Please enter first number :");
       num1 = input.nextInt();
       //Ask the user to enter the second number
       System.out.println("Please enter second number :");
       num2 = input.nextInt();
       //Ask the user to enter the third number
       System.out.println("Please enter third number :");
       num3 = input.nextInt();
      //Perform a code that checks if the first number is the largest
       {if (num1>num2 && num1>num3)
        System.out.println(num1+ " is the largest number");
          largest = num1;
           //Perform a code that checks if the first number is the smallest
          if (num1<num2 && num1<num3)
        System.out.println(num1+ " is the smallest number");
          smallest = num1;
       }
        //Perform a code that checks if the first number is the largest
       {if (num2>num1 && num2>num3)
        System.out.println(num2+ " is the largest number");
         largest = num2;
          //Perform a code that checks if the first number is the smallest
          if (num2<num2 && num2<num3)
        System.out.println(num2+ " is the smallest number");
          smallest = num2;
       }
        //Perform a code that checks if the first number is the largest
       {if (num3>num1 && num3>num2)
        System.out.println(num3+ " is the largest number");
          largest = num3;
           //Perform a code that checks if the first number is the smallest
          if (num3<num1 && num3<num2)
        System.out.println(num3+ " is the smallest number");
          smallest = num3;
       }
       
             
 }
  
    public static void main(String[] args) {
        Methods();
    }
    
}
