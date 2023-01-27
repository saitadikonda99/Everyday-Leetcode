// https://leetcode.com/problems/missing-number

class Solution {
    public int missingNumber(int[] nums) {
        
        int k = 0;
            while( k < nums.length) {
                int correct = nums[k];
            
            if(  nums[k] < nums.length && nums[k] != nums[correct]) {
                swap( nums , k , correct );

            }
            else {
                k++;
            }
            }
           
        for( int s=0; s<nums.length; s++ ){
            if( nums[s] != s) {
                return s;
            }
            
        }
        return nums.length;
    }
 
  void swap( int[] nums , int first , int second ) {
        int temp    = nums[first];
        nums[first]  = nums[second];
        nums[second] = temp;
    }
}
