  bool isPalindrome(char * s){
     int len = strlen(s);

     char *dope = malloc(len);

     int r=0;

     for( int k=0; k<len; k++ ) {
           char ch  = tolower(s[k]);
            if(isalnum(ch)) {
                dope[r] = ch;
                r++;
            }
     }
        int d = r/2;
        int check =1;
     for( int k=0; k<d; k++ ) {
         if( dope[k]!= dope[r-k-1])
            check = 0;
      
     }
     free(dope);
return check;
}
