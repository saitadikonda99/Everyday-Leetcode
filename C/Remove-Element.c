int removeElement(int* nums, int numsSize, int val){
                  
                int k=0;

                for( int s=0; s<numsSize; s++ ) {
                     
                       if (nums[s] != val) {
                        nums[k] = nums[s];
                             k++;
                   }
                }

           
          return k;      

}
