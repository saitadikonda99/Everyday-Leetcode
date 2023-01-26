class Solution {
    public String reverseOnlyLetters(String s) {
// check the the length of the string
         int t = s.length() - 1;
         // initially k value is 0 
        int k =  0;
        // lets convert into char array 
        char[] name = s.toCharArray();
        while( k < t ) {
            // skip the the index if it not a letter 
           while(!Character.isAlphabetic(name[k]) && k < t ) {
                k++;
           }
           // skip the the index if it not a letter 
          while(!Character.isAlphabetic(name[t]) && k < t) {
                t--;
            }
            // swap them 
         
            char temp = name[k];
            name[k] = name[t];
            name[t] = temp;
             k++;
             t--;
        
         
        }
        // return the string 
         
        return new String(name);
}
}
