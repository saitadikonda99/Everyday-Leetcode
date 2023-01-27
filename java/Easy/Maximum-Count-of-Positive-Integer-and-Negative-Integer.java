class Solution {
    public int maximumCount(int[] nums) {
            int count = 0;
            int ans = 0;
        for( int k=0; k<nums.length; k++ ) {
            if( nums[k] < 0 ) {
                count++;
            }
            if( nums[k] > 0 ) {
             ans++;
            }
            
        }

        
        if( ans > count ) {
            return ans;
        }

        return count;
    }
}
