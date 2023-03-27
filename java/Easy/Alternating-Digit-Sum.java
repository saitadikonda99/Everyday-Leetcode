class Solution {
    public int alternateDigitSum(int n) {
        // count number of digits in the number
        int count = EvenOdd( n );
        int check = 0;
        // if the number is even 
        if( (count & 1 ) != 0 ) check = 1;

        // sum : to return the answer
        int sum = 0;
        while( n > 0 ) {
            int rem = n % 10;
            if( check % 2 != 0 ) {
                sum += rem;
                check++;
            }
            else {
                 sum -= rem;
                 check++;
            }
            n /= 10;
        }
        // return the answer 
        return sum;
    }

// function to check the number of digits in the number
    public int EvenOdd( int num ) {
        int count = 0;
        while( num > 0 ) {
            count++;
            num /= 10;
    }
    return count;
    }
}
 
