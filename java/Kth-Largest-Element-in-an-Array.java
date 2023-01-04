class Solution {
    public int findKthLargest(int[] nums, int k) {

        sort( nums , 0 , nums.length-1 );
        int ans = nums[nums.length-k];
        return ans;
    }
        
    void sort( int[] nums , int low , int hi ) {

        if( low >= hi ) {
            return;
        }
        // let's take st and end 
        int st  = low;
        int end = hi;

        // let's calculate the mid value 
        int mid  = st + ( end - st ) / 2;
 

        // take mid as pivot element 

        int pivot = nums[mid];

        while( st <= end ) {
            // sort the pivot and after elements

            while( nums[st] < pivot ) {
                st++;
            }
            while( nums[end] > pivot ) {
                end--;
            }
        
            // swap the elements

            if( st <= end ) {
                int temp  = nums[st];
                nums[st]  = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
        }

        sort( nums , low , end );
        sort( nums , st , hi );

    }
}

