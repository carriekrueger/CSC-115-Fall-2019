// Carrie Krueger
// 10-1-19
// Notes on if/else statements

import java.util.Scanner;

public class IfElseNotes {
    public static void main(String[] args) {
        
        ifMethod(); // let's explore ifs and elses
    }
    
    // a method to study if statements 
    public static void ifMethod() {
    
        // Task: ask the user for a number and tell them if it's even 
        
        Scanner sc = new Scanner(System.in);  // make a Scanner that reads from the keyboard 
        
        System.out.println("Enter a number:");  // prompt the user for a number 
        int number = sc.nextInt(); // read and store the number  
        
        /* Three common mistakes: 
           1. DON'T put a ';' after the if()
           2. DO put curly braces { } around the code to be executed if true 
           3. DO remember to test for equality with '=='
        */
        
        if(number % 2 == 0) {     // test for eveness with mod
            System.out.println(number + " is even.");
            System.out.println("Rock on!!");
        }
        
        System.out.println("The end.");  // prints every time  
        
        // Task: compare two numbers 
        
        int num1 = 12; 
        int num2 = 7;
        
        // compare and output a message 
        if(num1 < num2) {
            
            System.out.println("num1 is less!");
        } else {
            System.out.println("num1 is NOT less!");     // why not num2 is less
        }
        
        sc.close();
 
        
    }
}
