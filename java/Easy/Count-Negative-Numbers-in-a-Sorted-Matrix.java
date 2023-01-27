class Solution {
    public int countNegatives(int[][] grid) {

         int count = 0;

         for( int k=0; k<grid.length; k++ ) {

             for( int s=0; s<grid[0].length; s++ ){
                 if( grid[k][s] < 0 ) {
                     count++;
                 }
             }
         }
        return count;
    }
}
