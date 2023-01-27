class Solution {
    public int maxProduct(int[] nums) {

        sort( nums , 0 , nums.length -1 );
        return (nums[nums.length-1]-1) * ( nums[nums.length-2]-1  );
    }

    public void sort( int[] arr , int low , int hi ) {
        // consider the following
        if( low >= hi ) {
            return;
        }
        int start = low;
        int end   = hi;

        // calculate the mid element

        int mid   = start + ( end - start ) / 2;
        int pivot = arr[mid];
        // run the while loop

        while( start <= end ) {

            // also a reason , why it won't swaped if it is already sorted
        while( arr[start] < pivot ) {
                start++;
            }
            while( arr[end] > pivot ) {
                end--;
            }
             if( start <= end ) {
                int temp   = arr[start];
                arr[start] = arr[ end ];
                arr[end]   = temp;
                start++;
                end--;
            }
        }

        // now my pivot index is at right index , please sort two halves
        sort( arr, low,end );
        sort( arr, start, hi );

    }
}
