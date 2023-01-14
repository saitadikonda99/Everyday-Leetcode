class Solution {
    public int[] sortArray(int[] nums) {
        // by using quick we can sort the array 
        // let's take sort function with array 
        // starting index of 0 
        // ending index of nums.length - 1
       sort( nums , 0 , nums.length - 1);
        
        // return the final sorted array nums
       return nums;
    }

     void sort( int[] nums , int low , int hi) {
    
    // if the low is greater than or equal to high then simply return to sortArray method 
     if( low >= hi ) {
         return;
     }
         // let's say the initial value of st is low 
         // let's say the initial value of end is hi
        int st = low;
        int end = hi;
        // calculate the mid 
        // in java int value might be exceed 
        int mid = st + ( end - st ) / 2;
        // take the pivot element as numd[mid]
        int pivot = nums[mid];  

        // break the loop if the st is greater than end 

        while( st <= end ) {
            
            // if the pivot right side elements are less than pivot then increase the st
            while( nums[st] < pivot ) {
                st++;
            }
             // if the pivot right side elements are greater than pivot then decrease the end
             while( nums[end] > pivot ) {
                end--;
            }

            // swap me elements 
            if( st <= end ) {
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
        }
            // use recursion
            sort( nums , low , end );
             sort( nums , st , hi );
        
    }
}
