/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize){

    int *arr =(int*)malloc(numsSize * sizeof( int  ));

    for( int k=0; k<numsSize; k++ ) {
          arr[k] = 0;
        for( int s=0; s<=k; s++ ) {
            arr[k] = arr[k] + nums[s];
                    }

    }
    *returnSize = numsSize;
    return arr;
    
}
