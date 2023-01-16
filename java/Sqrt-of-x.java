class Solution {
    public int mySqrt(int x) {

        
        long start = 0;
        long end   = x;
        long ans   = -1;
        while( start <= end ) {
            // calculate the mid value 
            // long value might exceed in java so, better to use 
            // mid = start + (end - start ) / 2;
            // than mid = start+ end / 2;
            long mid = start + (end - start ) / 2;

        // if x is greater than mid * mid  then store mid in ans 
        // if the while condition breaks then ans will be the final answer
        // start = mid + 1

            if(  x > mid*mid  ) {
                ans = mid;
                 start = mid + 1;
            }
           // if mid * mid is greater than the x it means 
           // then it means there is no chance of ans after mid 
           // so end will be mid - 1;
            else if(  x < mid*mid ) {
                end = mid - 1 ;
            }
            // If the value of x is not greater than mid and
            // not less than mid, return mid."
            else {
                // type cast the mid to int 
                return (int)mid;
            }
             
        }
         // type cast the ans to int 
       return (int)ans; 
    }
}
