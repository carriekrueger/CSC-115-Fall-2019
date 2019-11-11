// Carrie Krueger
// 11-11-19
// Partial code for validatePassword() method from Project: Password Suite


public class PasswordValidateNotes {
	
	public static void main(String[] args) {
	    
	    // main method code
	    // input is the password that the user typed in to check 
	    
	    if(validatePassword(input) == true) {
	           System.out.println("Password valid");
	    } else {
	           System.out.println("Password invalid");
	    }
	}
	
	public static boolean validatePassword(String input) {
	    
	    // Rules: at least 8 Characters
	    // At least 1 capital letter
	    // At least 2 numbers 
	    
	    // check if length is at least 8
	    
	    if(input.length() < 8) {
	        return false;
	    }
	    
	    // check for 1 capital letter 
	    int loopCounter = 0;
	    int capitalCounter = 0;
	    
	    while(loopCounter < input.length()) {
	        char ch = input.charAt(loopCounter);
	        
	        if(ch >= 'A' && ch <= 'Z'){
	            capitalCounter++;
	        }
	        
	        loopCounter++;
	    }
	    
	    // check for 2 numbers 
	    // *** WRITE THIS PART OF THE CODE ***//
	    
	   
	    // returns true if password passes the above tests 
	   
	    if(capitalCounter >= 1 && numberCounter >= 2) {
	        return true;
	    } 
	    return false;    // could put in else, don't have to 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
