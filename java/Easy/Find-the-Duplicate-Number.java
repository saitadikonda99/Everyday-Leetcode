class Solution {
    public int findDuplicate(int[] nums) {

        int k = 0;
            while( k < nums.length ) {
                int correct = nums[k] - 1;

                if( nums[k] != nums[correct]) {
                        swap( nums , k , correct );
                }
                else {
                    k++;
                }
            }       
            for( int s=0; s<nums.length; s++ ) {
                if( nums[s] != s + 1 ) {
                    return nums[s];
                }
            }
            return -1;
    }

    void swap( int[] nums , int first , int second ) {
            int temp    = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
    }
}
