class Solution {
    public boolean strongPasswordCheckerII(String password) {

        // first let's check whether word has at least 8 characters.
        // if not simply return false 

        if(password.length() < 8 ) {
            return false;
        }

        for( int k=0; k<password.length() - 1; k++ ) {
            
        if( password.charAt(k) ==  password.charAt(k+1)) {
                return false;
        }
           
        }
              
              
 
// You can use a boolean flag to define 
// certain types of characters seen in the string.
            
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;

        for(int k=0; k<password.length(); k++ ) {

            // it contains at least one lowercase letter.

            if( password.charAt(k) < 123 && password.charAt(k) > 96 ) {
               a = true;
            }
            // It contains at least one uppercase letter.
               if( password.charAt(k) < 91 && password.charAt(k) > 64 ) {
               
               b = true;
            }

            // It contains at least one digit.
               if( password.charAt(k) <='9' && password.charAt(k) >= '0' ) {
                 c = true;
                
            }                   
            //   It contains at least one special character. The special   
            //characters are the characters in the following string: "!@#$%^&*
            //()-+".
               if( password.charAt(k) =='!' || password.charAt(k) == '@' || 
password.charAt(k) == '#' || password.charAt(k) == '$' || password.charAt(k) == '%' 
|| password.charAt(k) == '^' || password.charAt(k) == '&' || password.charAt(k) == 
'*' || password.charAt(k) == '(' || password.charAt(k) == ')' || password.charAt(k) 
== '-' || password.charAt(k) == '+'  ) {
              d = true;
                 
            }
        
        }

        

        return a && b && c && d;
    }
}














