// Find the Index of the First Occurrence in a String

class Solution {
    public int strStr(String haystack, String needle) {

        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();

        for( int k=0; k<arr1.length; k++ ) {
            char[] temp = new char[arr2.length];
            int t = 0;
            for( int s=k; s<k+arr2.length && s<arr1.length; s++ ) {
                temp[t] = arr1[s];
                t++;
            }
            String temp2 = new String(temp);
            if( temp2.equals(needle)) return k;
        }
    return -1;
     } 
}
