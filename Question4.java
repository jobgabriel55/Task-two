/* This program was done by 21/04321- Job Gabriel
Question 4: Task two
*/ 
package question.pkg4;

import java.util.Scanner;


public class Question4 {

    

  public static void Question4()
          // calling a non-static method
    { int z=21;
       System.out.println(z);
       
       
     System.out.println("21 is Non Static method that is called using constructors");
   
}
  //calling a static method
 static int age= 20;
   static int regno = 2104321;
    
   
   
    public static void main(String[] args) {
        //create object class
        Scanner input = new Scanner(System.in);
      
        System.out.println(age+ " and" +regno+ " were formed using static methods");
        
        Question4();
    
   
    }
   
}
