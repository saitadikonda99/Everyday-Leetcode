class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
             int k = 0;
            // s equals to length of the array 
            int s = nums.length - 1;
            // sorting the array using while loop 

            while(k <= s ) {
                // checking the correct index 
                int correct = nums[k] - 1;
                // check the index  equals to nums[index]
                // if there are different swap them 
                if( nums[k] != nums[correct] ) {
                        int temp = nums[k];
                        nums[k]  = nums[correct];
                        nums[correct] = temp;

                 }
                 // if the index + 1 is equals to arr[index] than increment the k
                 // to move to next element 
                 else {
                     k++;
                 }
            }

            // check the wrong the index element 
            // we are using the array list because there is a chance of getting
            // two or more duplicate elements 

            List<Integer> sai = new ArrayList<>();
            // using for loop find the mismatched array element 
            for( int ch=0; ch<nums.length; ch++ ) {
                if( nums[ch] != ch + 1  ) {
                    sai.add( nums[ch] );
                }
            }
            // return the answer 
        return sai;
    }
}
