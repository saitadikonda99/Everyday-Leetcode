class Solution {
    public int smallestEqual(int[] nums) {
        /* 
        hint :-

        Starting with i=0, check the condition for each index. 
        The first one you find to be true is the smallest index

        */

        // checking with while loop 
        int k = 0;

        while( k < nums.length ) {

            if(  k % 10  == nums[k] ) {
                return k;
            }
            k++;
        }
        return -1;
    }

}
