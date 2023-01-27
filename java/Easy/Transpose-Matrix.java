class Solution {
    public int[][] transpose(int[][] matrix) {


        // use two loops to print the transpose of matrix

        // initial loop 


            int[][] mat = new int[matrix[0].length][matrix.length];
        for( int k=0; k < matrix.length; k++ ) {
            

            for( int s=0; s < matrix[0].length; s++ ) {

                mat[s][k] = matrix[k][s];
            }
        }
        

        return mat;
    }
}
