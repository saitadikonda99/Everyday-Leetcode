int lengthOfLastWord(char * s){
        int len = 0,ch = 0;
     for( int k=0 ;s[k]!='\0'; k++)
     len++;
     int r = len-1;
            while ( r>= 0 && s[r] == ' ') {
    r--;
  }
     for( int k=r; k>=0; k-- ) {

          if( s[k] == ' ')
            break;
            else
            ch++;
     }
     return ch;
          
}
