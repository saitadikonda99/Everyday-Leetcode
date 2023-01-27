https://leetcode.com/problems/search-insert-position/ 

int searchInsert(int* nums, int numsSize, int target){

      int start = 0;
      int end = numsSize - 1;

      while( start <= end ) {
          int mid = start + (end - start );

          if( nums[mid] > target) {
              end = mid - 1;
          } 
          else if ( nums[mid] < target ) {
              start = mid + 1;

          }
          else 
            {
                return mid;
            }
      }
      return start; 
      }
