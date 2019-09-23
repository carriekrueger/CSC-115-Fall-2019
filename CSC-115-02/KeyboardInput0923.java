// Carrie Krueger
// 9-23-19
// How to use a Scanner to read input from the keyboard

import java.util.Scanner; 
// To read from the keyboard, we use the premade Scanner class in Java 
// Certain premade classes need to be imported to be used 
// Scanner: imported           Math, String: no import 

public class KeyboardInput {
    public static void main(String[] args) {
        
        readInput(); // in here we will read input from the keyboard
    }
    
    // in this method we will read user input from the keyboard
    public static void readInput() {
    
        String name; 
        int age;
        
        // INSTANTIATE (create) a Scanner that reads from the keyboard 
        // This next lines makes a Scanner called 'sc'
        
        Scanner sc = new Scanner(System.in);
        // Why 'sc'??? could be anything... descriptive names are helpful 
    
        // Prompt user for information 
        // use the .nextLine() method to read and store text 
        
        System.out.println("What is your full name?");
        name = sc.nextLine();  // reads in line of text and saves it 
    
        // Scanners have methods to read in the next piece of data until 
        // there is a space or a newline 
        // To read in an int, use .nextInt() 
        
        System.out.println("Enter your age:");
        age = sc.nextInt(); 
    
        // Echo [concatentation]
        System.out.println("Hello, " + name + ". How does it feel to be " + age + "?");
    
  
    }
}
