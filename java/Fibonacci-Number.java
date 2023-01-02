class Solution {
    public int fib(int n) {
        // base condition
        // if the number is less than two return the number
        // because the fibonacci series starts from 
        // 0 1 so if n is 0 return 0
        // if n is 1 return 1 
            if( n < 2 ) {
                return n;
            }

            //calculating the fib number 
            // return the answer 
        return fib( n -1 ) + fib( n - 2 );
    }
}
