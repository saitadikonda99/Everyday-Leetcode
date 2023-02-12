class Solution {
    public long findTheArrayConcVal(int[] nums) {
        
        int k = 0;
        int s = nums.length - 1;
        long concatenation = 0;
        while( k < s) {
            long ans = digits(nums[s]);
            concatenation += nums[k] * ans + nums[s];
            k++;
            s--;
            
        }
         if( (  nums.length & 1 )== 1 )
        return concatenation + nums[nums.length / 2];
        else {
            return concatenation;
        }
    }
    
    public long digits( int n ) {
        long count = 1;
        while( n > 0 ) {
            count *= 10;
            n /= 10;
        }
        return count;
    }
}
