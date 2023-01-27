class Solution {
    public boolean isThree(int n) {
            int count = 0;
            // count the all divisors using 
a for loop
            // initial value of k is 1
        for( int k=1; k<=n; k++ ) {
            if( n % k == 0 ) {
                // count divisors of n 
                count++;
            }
        }
        // return the answer 
        return count == 3;
    }
}
