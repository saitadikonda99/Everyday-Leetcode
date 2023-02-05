class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];
        int s=0;
        for(int k=0; k<nums.length / 2; k++ ) {

             arr[s] = nums[k];
             arr[s+1] = nums[n];
                n++;
                s += 2;
        }
     return arr;   
    }
}
