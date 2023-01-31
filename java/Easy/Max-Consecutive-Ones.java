class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

            int count = 0;
            int temp = 0;
        for( int k=0; k<nums.length; k++ ) {
            
                if( nums[k] == 1) {
                    count++;
                }
                 if( nums[k] == 0 ) {
                    if( temp < count ) {
                       temp = count;
                       count = 0;
                    }
                    else {
                        count = 0;
                    }
                }
        }
      if( count < temp) {
          return temp;
      }
      else{
          return count;
      }
    }
}
