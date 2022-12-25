bool isPalindrome(int x){
       long sai = x,k,s=0;
       while( x>0) {
           k = x%10;
           s = s*10 + k;
           x = x/10;
       }
        if( sai == s)
            return true;
            else
             return false;

}
