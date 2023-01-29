class Solution {
    public int arraySign(int[] nums) {
        
        int neg = 0;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                return 0;
            }
            if (nums[k] < 0) {
                neg++;
            }
        }
    if( (neg & 1) == 1  ) {
        return -1;
    }
    else
        return 1;
    }
}
