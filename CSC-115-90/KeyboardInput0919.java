// Carrie Krueger
// 9-19-19
// How to use a Scanner to read input from the keyboard

import java.util.Scanner;
//To read from the keyboard, we use the premade Scanner class in Java 
// Certain premade classes need to be imported to be used 
// Scanner: import        Math, String: no import 

public class KeyboardInput {
    public static void main(String[] args) {
        
        readInput(); // in here we will read input from the keyboard
    }
    
    // in this method we will read user input from the keyboard
    public static void readInput() {
        
        String name; 
        int age; 
        
        // INSTANTIATE (create) a Scanner that reads from keyboard 
        // This makes a Scanner called 'sc' 
        
        Scanner sc = new Scanner(System.in); 
        // why sc? anything I want... descriptive variable names are helpful 
        
        // Prompt the user for information 
        // use the .nextLine() method to read from the keyboard and store the value 
        
        System.out.println("What is your full name?");
        name = sc.nextLine();  // reads in the line of text and stores it 
        
        // Scanners have methods to read in the next piece of data until there is a space 
        // or a newline 
        // To read and store an int, use .nextInt() 
        
        System.out.println("Enter your age:");
        age = sc.nextInt();
        
        // Echo (concatentation)
        
        System.out.println("Hello, " + name + ". How does it feel being " + age + "?");
        
        sc.close(); // close the Scanner (makes the compiler happy, useful later)
        

        
    }
}
