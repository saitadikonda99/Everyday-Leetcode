class Solution {
    public int diagonalSum(int[][] mat) {
        
            // use two loops two calculate the sum of diagonals
            int sum1 = 0;
            int sum2 = 0;
            /*

             There will be overlap of elements in the primary and secondary
             diagonals if and only if the length of the matrix is odd, 
             which is at the center.

            */

            
            for( int k=0; k<mat.length; k++ ) {
                for( int s=0; s<mat.length; s++ ) {
                    if( k == s ) {
                        sum1 += mat[k][s];
                    }
                    else if( k + s == mat.length - 1 ) {
                        
                        sum2 += mat[k][s];
                    }
                }
            }
            return sum1+sum2;
    }
}
