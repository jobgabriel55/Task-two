/* This program was done by 21/04321- Job Gabriel
Question 3: Task two
*/ 
package area;

import java.util.Scanner;


public class Area {
public static void areaoftriangle(){
    //Create object scanner
Scanner input = new Scanner(System.in);
//Ask the user to enter the base of the triangle
    System.out.println("Enter the base of the triangle");
       int b = input.nextInt();
       //Ask the user to enter the height of the triangle
       System.out.println("Enter the height of the triangle");
       int h= input.nextInt();
       //calculating the area of the triangle
int area= (b*h)/2;
System.out.println("The area of the triangle is: " +area);
}
    public static void main(String[] args) {
        areaoftriangle();
    }

}
