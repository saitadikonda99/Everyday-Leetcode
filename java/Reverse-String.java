class Solution {
    public void reverseString(char[] s) {
        
        int t = s.length- 1;
        int k =  0;
        while( k <= t ) {
            char temp = s[k];
            s[k] = s[t];
            s[t] = temp;
            t--;
            k++;
        }
         System.out.println(Arrays.toString(s));
    }
}
