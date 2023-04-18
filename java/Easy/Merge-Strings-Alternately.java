class Solution {
    public String mergeAlternately(String 
word1, String word2) {
        
        char[] arr1 = 
word1.toCharArray();
        char[] arr2 = 
word2.toCharArray();

        char[] res = new char[arr1.length 
+ arr2.length];

            int k1 = 0;
            int k2 = 0;
            int k3 = 0;
           while( k1 < arr1.length && k2 
< arr2.length) {
                res[k3] = arr1[k1];
                k3++;
                k1++;
                res[k3] = arr2[k2];
                k3++;
                k2++;
           }

        while( k1 < arr1.length ) {
            res[k3] = arr1[k1];
                k3++;
                k1++;
        }

        while( k2 < arr2.length ) { 
            res[k3] = arr2[k2];
                k3++;
                k2++;
    }
     return new String(res);
}
}
