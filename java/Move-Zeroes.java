class Solution {
    public void moveZeroes(int[] nums) {

        if( nums.length == 1 ) {
            return;
        }
        // first check the zero element in the array 

        int k = 0;
        int s = nums.length;
        int index = 0;
        while( k < s) {

            if( nums[k] == 0) {
                k++;
            }
            else {
                // if the number is not zero than swap the to starting 
                swap( nums , k , index);
                // once you done then increase the index
                index++;
                 k++;
            }
        }

    }

    // swap function 
    void swap( int[] nums , int first , int second ) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
 
