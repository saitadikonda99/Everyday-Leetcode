class Solution {
    public int differenceOfSum(int[] nums) {


        int sum1 = 0;
        int sum2 = 0;

        for( int k : nums) {
            sum1 += k;
        }
            int k =0;
            while( k < nums.length) {
        while( nums[k] > 0 ) {
            int rem = nums[k] % 10;
             sum2 +=rem;
             nums[k] /= 10;
              
        }

        k++;
            }
        int diff = Math.abs(sum1 - sum2);

        return diff;
    }
}
