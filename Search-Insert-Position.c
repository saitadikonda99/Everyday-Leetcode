 int searchInsert(int* nums, int numsSize, int target){
     int index=0;
    int check=0;

     for(int k=0;k<numsSize;k++ ) {
         if(  nums[k] >= target) {
             index = k;
             check =1;
              break;
         }
     }
         if( check == 1) 
            return index;
        else  
                 return numsSize;
                return NULL;

 }
