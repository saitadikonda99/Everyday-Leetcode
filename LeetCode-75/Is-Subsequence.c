bool isSubsequence(char * s, char * t){
        int r = 0;
        for( int k=0; k<strlen(t); k++ ) {

            if( t[k] == s[r] ) {
                      r++;
                    }
                 
        }
  

       return r == strlen(s);
}
