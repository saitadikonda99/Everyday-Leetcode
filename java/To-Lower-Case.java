class Solution {
    public String toLowerCase(String s) {
        
        char[] ans = s.toCharArray();
        for( int k=0; k< ans.length ; k++ ) {
             if( ans[k] >='A' && ans[k] <='Z')
            ans[k] = (char)(ans[k] + 32);
            else {
                ans[k] =(ans[k]);
            }
        }
        return new String(ans);
    }
}
