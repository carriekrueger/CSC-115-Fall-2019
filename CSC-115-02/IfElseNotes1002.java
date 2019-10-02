// Carrie Krueger
// 10-2-19
// Notes on if/else statements

import java.util.Scanner;

public class IfElseNotes {
    public static void main(String[] args) {
        
        ifMethod(); // let's explore ifs and elses
    }
    
    // a method to study if statements 
    public static void ifMethod() {
        
        // Task: ask the user for a number and tell them if it's even 
        
        Scanner sc = new Scanner(System.in); // makes a Scanner to read from the keyboard 
        
        System.out.println("Enter a number:");  //prompt user for number and read it in 
        int number = sc.nextInt();
        
        /* Three common mistakes: 
           1. DON'T put a ';' after if()  
           2. DO put curly braces { } around the code to be executed if true   
           3. DO remember to test for equality with '=='
        */
        
        // check for eveness with mod
        if(number % 2 == 0) {
            System.out.println(number + " is even.");
            System.out.println("Rock on!!!");
        }
        
        System.out.println("The end.");  // prints every time 
        
        
        // Task: Compare two numbers 
        
        int num1 = 12;
        int num2 = 7;
        
        // compare and output message
        if(num1 < num2) {
            System.out.println("num1 is less.");
        } else {
            System.out.println("num1 is NOT less.");  // why not num1 greater?
        }
        
        
        sc.close();
        
 
        
    }
}
