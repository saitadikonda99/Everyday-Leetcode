class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] name = new int[2 * nums.length];

        for( int k=0; k<nums.length; k++ ) {

                name[k] = nums[k];
                name[k+nums.length] = nums[k];
        }
         return name;
    }
}

