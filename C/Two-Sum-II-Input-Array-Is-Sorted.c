
 //  Note: The returned array must be malloced, assume caller calls free().
 
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
 
             
                for(  int k=0; k<numsSize; k++ ) {
                    for( int s=k+1; s<numsSize; s++) {
                        if (nums[k] + nums[s] == target) {
                            int * sai = malloc(2 * sizeof(int));
                            *returnSize = 2;
                      sai[0] = k;
                      sai[1] = s;
                            return sai;
                        }       
                    }
                 }
         
  return NULL;
}
