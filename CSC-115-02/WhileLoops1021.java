// Carrie Krueger
// 10-21-19
// All about while loops 


public class WhileLoops {
    public static void main(String[] args) {
        
       loops(); // while loops
    }
    
    // this method looks at while loops 
    public static void loops() {
        
        // Ask a question once: if-else statement 
        // Ask a questions repeatedly (or do something repeatedly):  loop (while loop)
        
        // LOOP RULES: 
        
        // When you program a loop, you should know that it will 
        // DEFINITELY end once some condition has occurred 
        
        // Usually you have to increment some variable
        // so that the loop will approach the end state 
        // LCV (loop control variable) 
        
        // WAYS TO INCREMENT A VARIABLE (3.7 in textbook)
        
         int count = 0; 
        // How to add 1? 
        
        count = count + 1;  // adds 1 and saves the value (assigns) to count 
        count += 1; // compound operator (shortcut!!)
        count++;  // another common way to increment by one 
        
        // Use curly braces around the while loop code!!! 
        
        // HERE COMES A LOOP 
        
        int counter = 0; 
        
        // ends when the value of counter is 5 
        while(counter != 5) {
            
            counter += 1; // increment - get counter to 5
            System.out.println(counter);
        }
        
        // how many times did the loop run?  // 5
        // can adjust start/end/increment values
        
        int num = 0;
        
        while(num < 3) {
            System.out.println(num);
        }
        
        // INFINITE LOOP OF DOOM 
        // Ctrl + z to escape / break the loop in the terminal 
        // needs an incrementor 
        
        // LIVE CODE DEMOS in Blackboard...
        
        
        
    }
}
    
