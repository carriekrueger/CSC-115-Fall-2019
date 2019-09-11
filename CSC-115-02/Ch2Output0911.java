// Carrie Krueger
// 9-11-19
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2Output {
    public static void main(String[] args) {
        escape(); // this method will explore output and escape sequences
    }
    
    // this method investigates output and escape sequences
    
    public static void escape() {
        
        // print vs. println 
        System.out.print("Hello Class!");  // the next thing prints on the same line 
        System.out.println("It is Wednesday."); // the next thing prints on the next line 
        System.out.println("Friday is coming???");
        
        System.out.println();   // print blank line 
        
        // OUTPUT 
        System.out.println(2);  // you can put text or numbers in a print statement
        System.out.println(1 + 2 * 3);  // or do math! (order of operations...)
        
        // ESCAPE SEQUENCES 
        // special characters denoted with the \ (the escape character)
        
        // \n -> new line 
        System.out.print("Hello! \n\n\n\n");
        System.out.print("Hell\no! ");
        
        // \t -> tab
        System.out.println("Hello\tWorld!");
         System.out.println("Hello\t\t\t\tWorld!");
        
        // \\ -> \
        System.out.println("\\");
        
        // \" -> "
        System.out.println("She said \"Java is the best language!!! \"");
        
        
        // You try!
        // Think of a quotation or saying that you know.
        // Create a new class called PrintQuote 
        // Output that saying with visible quotation marks in the output 
        // ex. "That's the way the cookie crumbles."
        
        // use a method to print your quote! :)


        
        
    }
    
}
        
