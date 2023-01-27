int pivotIndex(int* nums, int numsSize){
   
  for( int k=0; k<numsSize; k++ ) {
      int sum1 = 0;
      int sum2 = 0;
      for( int s=0; s<numsSize; s++ ) {
          if( s > k )
          sum1 += nums[s];
            if( s < k )
          sum2 += nums[s]; 
             
      }
      if( sum1 == sum2 )  {
       return k;
       break;
      }
      
  }
  return -1;

}
