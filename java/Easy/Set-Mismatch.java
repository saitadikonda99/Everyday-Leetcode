class Solution {
    public int[] findErrorNums(int[] nums) {

        int s = 0;
        while( s< nums.length ) {
            // find the correct index
            // correct index is arr[k] which is element and subtract 1 from that 
            // so that we can find the correct index  
            int correct = nums[s] - 1;

            if( nums[s] != nums[correct]) {
                // swap the elements in the array
                swap( nums , s , correct );
            }
            else {
                s++;
            }
        }
        // check the duplicate element in the array after 
        int[] arr = { -1 , -1 };
        for( int k=0; k<nums.length; k++ ) {
            if( nums[k] != k + 1 ) {
                arr[0] = nums[k];
                arr[1] = k+1;
                
        }
        }

        return arr;
    }

    void swap( int[] nums , int first , int second ) {

                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
            }
    
}
