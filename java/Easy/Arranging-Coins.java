class Solution {
    public int arrangeCoins(int n) {

            long check = 0;
            long k =0;
        for( k=1; k<=n; k++) {
            check = check+k;
            if( check > n ) {
                return (int)k-1;
            } 
            if(check == n ) {
                return (int)k;
            }
          
        }
         return -1;
    }
}
