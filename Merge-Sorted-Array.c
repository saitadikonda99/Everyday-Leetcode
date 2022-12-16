void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
      
      for( int k=0; k<nums2Size; k++ ) {
            nums1[m+k] = nums2[k];
      }
         int ch = m+n;
      for( int k=0; k<ch-1; k++ ) {
          for( int s=0; s<ch-1-k; s++ ) {
              if(nums1[s] > nums1[s+1]) {
                  int temp = nums1[s];
                  nums1[s] = nums1[s+1];
                  nums1[s+1] = temp;
              }
          }
      }

}
