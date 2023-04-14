class Solution {
    public String reverseWords(String s) {


          char[] arr = s.toCharArray();
        int count = 0;
        for( int k=0; k<arr.length; k++ ) {
            int k1 = k;
            while( k<arr.length && arr[k] != ' ' ) {
                count++;
                k++;
            }
            
            int s1 = count -1 ;

        while( k1 < s1 ) {
            char temp = arr[k1];
            arr[k1] = arr[s1];
            arr[s1] = temp;
            k1++;
            s1--;
            }
            count++;
    }
             return new String(arr);
    }
}
