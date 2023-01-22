class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        

        for( int k=0; k<arr.length - 2; k++ ) {
            if( arr[k] % 2 != 0 ) {
                if( arr[k+1] % 2 != 0 ) {
                    if( arr[k+2] % 2 != 0 ) {
                        return true;
            }
        }
    }
        }
        return false;
    }

}
