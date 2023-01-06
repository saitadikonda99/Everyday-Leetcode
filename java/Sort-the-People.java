class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        // by using insertion sort

        for( int k=1; k<heights.length; k++ ) {

            int temp = heights[k];
            String sort = names[k];
            int s = k - 1;

            while( s >= 0 && heights[s] < temp ) {
                // sorting the string array with integer array
                heights[s+1] = heights[s];
                names[s+1] = names[s];
                 s--;
            }
            names[s+1] = sort;
            heights[s+1] = temp;
        }
        // returning the sorted string array 
        return names;
    }
}
