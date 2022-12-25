 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


 class Solution {
    public int[] searchRange(int[] nums, int target) {

        int start  = FirstLast(  nums , target , true );
        int end    = FirstLast(  nums , target , false);
        int[] ans = new int[2];
            ans[0] = start;
            ans[1] = end;
        return ans;
    }
     int FirstLast( int[] nums , int target , boolean  firstindex ) {

            int ans =  -1;
            int start = 0;
            int end = nums.length - 1;
        
        while( start <= end ) {

            int mid =  start + ( end - start ) / 2;
                    if( nums[mid] > target )
                        end = mid - 1;
                        else if( nums[mid] < target )
                            start = mid + 1;
                            else {
                                ans = mid;
                         if(  firstindex )
                                  end = mid - 1;
                                  else 
                                  start = mid + 1;
                            }
            }
            return ans;
        }
    }
