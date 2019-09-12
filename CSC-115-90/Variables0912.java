// Carrie Krueger
// 9-12-19
// Notes about variables and String output 

public class Variables {
    public static void main(String[] args) {
        
        variables();  // a method to investigate variables 
        aboutStrings(); // a method to look at String output 
    }
    
    // in this method we will look at variables 
    public static void variables() {
        
        /*  A variable is a place to store a value. 
            A variable holds data.
            It's a named location in the computer's memory.
            
            
            There's a few different types of information we can store:
            
            integer (whole numbers):   int 
            decimal (3.14, -6.07):     double 
            boolean (true, false):     boolean 
            character ('a', '3', '?'): char 
            
            
            Other types: long, short, float, byte 
            --> All primitive data types 
            */
            
            // When you want to use a variable: declare 
            // DECLARE a variable named 'age' that holds a whole number (int)
        
            int age;
            
            // variables names start with a lowercase and follow camelCase 
            // class names start with an uppercase 
        
            // When you want to give your variable a value: assign using =
            // ASSIGN the variable 'age' a value of '37'
            
            age = 37;
            
            // You can do both at once!
            // DECLARE a variable named 'gpa' that holds a decimal 
            // and ASSIGN it a value at the same time 
            
            double gpa = 3.14;
            
            // DISPLAY the current value of your variables 
            System.out.println("Your age is " + age + ".");
            System.out.println("Your gpa is " + gpa + ".");
            
            // Reassign the value of 'gpa'
            gpa = 2.718;
            System.out.println("Your gpa is now " + gpa + ".");
            
            
            // In general:
            
            // int        num     = 28;
            // type
            //            name      
            //                      value 
            
            
            
            int num1 = 4;
            int num2 = 5;
            
            // you can do stuff with variables -> print, do math 
            
            int sum = num1 + num2; 
            System.out.println(sum);  // 9 
            
            int x;      // x has been DECLARED, but it has not been ASSIGNED 
            
            
            // System.out.println(x);      // ERROR! won't work (need to initialize)
            
            // You try! 
            // Use your PrintQuote class (or make a new one)
            // Declare two int variables and assign them values 
            // Display the sum and the product 

        
    }
    
    // in this method we will look at Strings 
    public static void aboutStrings() {
        
        // STRING 
        // a variable that can hold a bunch of characters (like a word)
        // String is a class (uppercase) but we can use it like a primitive 
        
        String firstName = "Carrie";  // note the camelCase 
        System.out.println(firstName + " " + "Krueger");  // CONCATENATE
        
        // Mixing Strings and numbers is a tricky business 
        
        System.out.println("3 + 4");
        System.out.println(3 + 4);
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println("3 + 4 = " + 3 + 4);  // concatenated numbers onto the String
        System.out.println(3 + 4 + " = 3 + 4 = " + 3 + 4);
        System.out.println(3 + 4 + " = 3 + 4 = " + (3 + 4));  // order of operations helps
         
        System.out.println(3 - 4); 
       // System.out.println("3 - 4 = " + 3 - 4);   // error! 
        System.out.println("3 - 4 = " + (3 - 4)); // order of operations   
        
        int difference = 3 - 4; 
        System.out.println("3 - 4 = " + difference);
        
    }

    
    
}
