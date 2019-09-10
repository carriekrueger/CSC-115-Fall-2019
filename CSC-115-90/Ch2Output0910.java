// Carrie Krueger
// 9-10-19
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2Output {
    public static void main(String[] args) {
        escape(); // this method will explore output and escape sequences
    }
    
    // this method investigates output and escape sequences
    
    public static void escape() {
        // print vs. println
        System.out.print("Hello World!"); // next thing prints on the same line 
        System.out.println("It is Tuesday");  // next thing prints on the next line 
        System.out.println("After Monday...");
        
        System.out.println();  // print blank line
        
        // OUTPUT 
        
        System.out.println(2);  // you can put text or numbers in a print statement
        System.out.println(1 + 2 * 3);  // do math!  order of operations... 
        
        // ESCAPE SEQUENCES 
        // special characters for formatting etc. 
        // denoted with \ (the escape character)
        
        // \n -> new line 
        System.out.println("Hello World! \n\n\n\n\n");
        System.out.println("Hello \n\n World!");
        
        // \t -> tab 
        System.out.println("Hello\tHello");
         System.out.println("Hello\t\t\tHello");
         
        // \\ -> \
        
         System.out.println("\\");
         
        // \" -> "
        
        System.out.println("\"Java is the best language!\"");
        
        // You try!
        
        // Think of a quotation or saying that you know.
        // Create a new class called PrintQuote
        // Output the saying with visible quotation marks in the output.
        // ex. "That's the way the cookie crumbles."
        
        // use a method to print your qoute! :)
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
