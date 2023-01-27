class Solution {
    public int findMiddleIndex(int[] nums) {

   // using the hints 

   /* 

    Could we go from left to right and check to see if an index is a 
middle index?

        Do we need to sum every number to the left and right of an index 
each time?


        Use a prefix sum array where prefix[i] = nums[0] + nums[1] + ... + 
nums[i].
         */

  for( int k=0; k<nums.length; k++ ) {

      // use sum1 and sum2 to check whether the left side of the pivot and 
right side of the pivot elements sum
        // is equal or not ?
      int sum1 = 0;
      int sum2 = 0;
      
      for( int s=0; s<nums.length; s++ ) {
          if( s > k )
          sum1 += nums[s];
            if( s < k )
          sum2 += nums[s]; 
             
      }

      // if left side of the pivot and right side of the pivot elements 
sum
        // is equal then we got the answer 
      if( sum1 == sum2 )  {

          // now we can return the ans
       return k;
      }
      
  }
  return -1;

}
        
    }
