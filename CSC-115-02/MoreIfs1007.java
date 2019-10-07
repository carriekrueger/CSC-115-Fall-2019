// Carrie Krueger
// 10-7-19
// Eficiently using if-statements and multiple conditionals

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        betterIfs();  // efficient if statements
        multiples(); // multiple conditionals 
    }
    
    // a method that shows the preferred way to handle code that is being reused
    public static void betterIfs() {
    
        // When you have code that ends up being reused in your program:
        
         Scanner sc = new Scanner(System.in);  // makes a Scanner that reads from the keyboard 
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
        }
        
        System.out.println(age + " is a good age.");
        
        
       
        // less preferred way 
        /*
        Scanner sc = new Scanner(System.in);  // makes a Scanner that reads from the keyboard 
        System.out.println("What is your age?");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }
        
        if(age < 65) {
            System.out.println(age + " is a good age.");
        }
        
        */

        
    }
    
    // this method looks at ways to do multiple conditionals 
    public static void multiples() {
        
        int num = 37; 
        
        // boolean logic operator 
        
        if(num >= 40 || num <= 10) {
            System.out.println("You win!!!");
        }
        
        // boolean logic operator and short-circuit  
        
        if(num >= 40 && num <= 60) {
            System.out.println(num + " is in range!");
        }
        
        
        // let's compare num to 10 in a better way than we did before 
        // multiple ways to handle multiple conditionals 
        
        
        // only one outcome possible 
        // NESTED 
        // note the indentation: if/else/{ --> next line INDENTED 
        
        if(num > 10){
            System.out.println("Greater!");
        } else {
            if(num < 10) {
                System.out.println("Less");
            } else {
                System.out.println("Equal!");
            }
        }
        
        // only one outcome possible 
        // nesting neater 
        
        if(num > 10){
            System.out.println("Greater!");
        } else if(num < 10) {
            System.out.println("Less");
        } else {
            System.out.println("Equal!");
        }
            
        // more than one outcome possible 
        // not nested 
        num = 101;
        
        if(num > 10){
            System.out.println("Greater!");
        }
        
        if(num >= 100){
            System.out.println("Really big number!");
        }
        
        
        // Another option: SWITCH STATEMENTS 
        // Textbook 6.3 
        
        // if/else statements can handle ranges 
        // switch statements can only handle exact values 
        // switch statements can only be used with certain primitives and String 
        // if/else can get messy with { } ... more prone to errors (both syntax and logic)
        
        
        
    }
    
}
