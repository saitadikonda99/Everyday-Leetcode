class Solution {
    public int maxProfit(int[] prices) {

    // let's say initial value of min is zero
            int min = prices[0];
            int ans = 0;
        for( int k=1; k<prices.length; k++ ) {
               if( prices[k] < min ) {
                  min = prices[k];
               }
               else if( ans < prices[k] - min ) {
                   ans = prices[k] - min;
               }
            }
 
        return ans;
    }
}
