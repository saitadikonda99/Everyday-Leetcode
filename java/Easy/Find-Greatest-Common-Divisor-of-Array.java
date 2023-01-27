class Solution {
    public int findGCD(int[] nums) {


    // calculate the max and min values in the array 
        int max = nums[0];
        int min = nums[0];

        for( int k=1; k<nums.length; k++ ) {
            if( max < nums[k]) {
                max = nums[k];
            }
            if( min > nums[k]) {
                min = nums[k];
            }

        }
            // return the ans 
        int ans =  gcd ( min , max );
         return ans;
      
    }


    public int gcd( int min, int max ) {
        int ans = 1;
        for( int k=1; k<=min; k++ ) {

            if( min % k ==0 && max % k ==0 ) {
                    if( ans < k ) {
                        ans = k;
                    }
            }

        }
        return ans;
    }
}
    
