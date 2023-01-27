class Solution {
    public int maximumWealth(int[][] accounts) {

        // let's create an array list to store sum of wealth of a customer


        ArrayList<Integer> arr = new ArrayList<>(3);

        // use nested loop

        for( int k=0;  k<accounts.length; k++ ) {
            // after every inner loop sum will remain as zero
                int sum = 0;
            for( int s=0; s<accounts[0].length; s++ ){
                // calculate the sum of the elements in the coloumn 
                 sum = sum + accounts[k][s];
            }
            
              arr.add(sum);
        }
        
        // let's take max element as first element
        
        int max = arr.get(0);
     
       // then compare remaining elements in the array list to find the 
        // max element in the array list 

        for( int k=0; k< arr.size(); k++ ) {
            
            if( max < arr.get(k)) {
                // max is the largest number 
                max = arr.get(k);
            }
     
        }
  // return the maximum
    return max;
    }

}
