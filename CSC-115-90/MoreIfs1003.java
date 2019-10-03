// Carrie Krueger
// 10-3-19
// Eficiently using if-statements and multiple conditionals

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        betterIfs();  // efficient if statements
        multiples();  // multiple conditionals 
    }
    
    // a method that shows the preferred way to handle code that is being reused
    public static void betterIfs() {
    
        // When you have code that ends up being reused in your program: 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
        }
        
        System.out.println(age + " is a good age.");
    
        
        
        
        // less preferred way... 
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        
        if(age >= 65) {
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }
        
        if(age < 65) {        // or put else... 
        
            System.out.println(age + " is a good age.");
        }
        */
        
    }
    
    // this methods looks at ways to do multiple conditionals
    public static void multiples() {
        
        int num = 37;
        
        // boolean logic operators 
        
        if(num >= 40 || num <= 10){
            System.out.println("You win!!");
        }
        
        // short-circuit 
        if(num >= 40 && num <= 60) {
            System.out.println("Your number is in range!");
        }
        
        
        // let's compare num to 10 in a better way than we did before 
        // multiple ways to handle multiple conditionals 
        
        
        // only one outcome possible 
        // NESTED 
        // note the indentation: if/else/{ --> INDENT next line 
        
        if(num > 10) {
            System.out.println("Greater!");
        } else {
            if(num < 10) {
                System.out.println("Less!");
            } else {
                System.out.println("Equal!");
            }
        }
        
        
        // only one outcome possible
        // nesting NEATER 
        
        if(num > 10) {
            System.out.println("Greater!");
        } else if(num < 10 ){
            System.out.println("Less!");
        } else {
            System.out.println("Equal!");
        }
        
        
        // more one outcome possible 
        // not nested 
        
        num = 90;
        
        if(num > 10) {
            System.out.println("Greater!");
        }
        if(num > 100) {
            System.out.println("Really big number!!");
        }
        
        
        // Another option: SWITCH STATEMENT 
        // Textbook 6.3 
        
        // Pros and Cons:
        // -if/else statements can handle ranges
        // -switch statements can only handle exact values 
        // -switch statements can only be used with certain primitives and String 
        // if/else can get messy with { }, more prone to errors (both syntax and logic)
        
  
        
    }
    

    
}
