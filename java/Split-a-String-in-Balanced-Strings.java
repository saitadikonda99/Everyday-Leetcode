// Split a String in Balanced Strings

class Solution {
    public int balancedStringSplit(String s) {

         
        int t = s.length();
        int k =0;
        int ch = 0;
        int r = 0;
        while( k < t ) {
            /* 
            By using hint 1 
            Loop from left to right maintaining 
            a balance variable when it gets an L increase i
            t by one otherwise decrease it by one.

                */

            if( s.charAt(k) == 'L') {
                 ch++;
            }
            else {
                ch--;
            }
            /* 
            By using hint 2

    Whenever the balance variable reaches zero
     then we increase the answer by one.
             
                */

            if( ch == 0 ) {
                r++;
            }
    
            k++;
        }
        // return the answer 
    return r;
    }
}
