 int searchInsert(int* nums, int numsSize, int target){
      
     for(int k=0;k<numsSize;k++ ) {
         if(  nums[k] >= target)  
              return k;   
         
     }           return numsSize;

 }
