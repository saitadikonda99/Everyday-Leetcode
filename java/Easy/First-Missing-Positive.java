// https://leetcode.com/problems/first-missing-positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        // let's say initial value of k = 0
        int k=0;
        while( k < nums.length ) {
             
            // check whether the element -1 equals to index value
            int correct = nums[k] - 1;
            // if element -1 is not equals to index value then swap the elements in to 
the correct index
            // if the element is greater than the nums.length then we cannot arrange the 
that element in cyclic sort so nums elements must be less than index size
	if( nums[k] <= nums.length && nums[k] > 0 && nums[k] != nums[correct] ) {
                swap( nums , k , correct);
            }
            else {
                k++;
            }
        }
// let's check the minimum positive element missing in the array
// return the missing element 
// use for loop
 
        for( int s=0; s < nums.length; s++ ) {
            if( nums[s] != s + 1 ) {
                return s+1;
            }
        }
        
        // if the element no found then return the arr.length-1;
        return nums.length+1;
    }
    // swap the wrong index element with the correct index element 
    void swap( int[] nums , int k , int correct ) {
        int temp = nums[k];
        nums[k] = nums[correct];
        nums[correct] = temp;
    }
}
