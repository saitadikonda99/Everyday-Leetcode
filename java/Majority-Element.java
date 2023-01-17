class Solution {
    public int majorityElement(int[] nums) {
                
        for( int k=0; k<nums.length-1; k++ ) {
            
             for( int s=1; s<nums.length-k; s++ ) {
                 if( nums[s-1] > nums[s]) {
                     int temp = nums[s];
                     nums[s]  = nums[s-1];
                     nums[s-1]  = temp;
                 }

             }
            
             }

        return nums[nums.length/2];
        
    }
}
