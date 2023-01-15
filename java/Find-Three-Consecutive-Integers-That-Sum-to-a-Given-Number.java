class Solution {
    public long[] sumOfThree(long num) {
          
          // here if the number is divided by 3 
          // then it is the answer 
          long s = num % 3;
          if( s == 0 ) {

              long k = num / 3;
          // simply return k-1, k, k+1;
                return new long[]{ ( k-1 ), k , ( k + 1 )};
            }
          // if you cannot find the answer then simply return empty array 
        long[] sai={};
        return sai;
        
    }
