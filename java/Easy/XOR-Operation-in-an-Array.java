class Solution {
    public int xorOperation(int n, int start) {
            int ans = 0;
        for( int k=0; k<n; k++ ) {
                ans ^= start + 2 * k;
        }
        return ans;
    }
}
