

int climbStairs(int n){
         
        if( n == 1)
            return 1;
            else {
                int n1=1, n2=1,n3;
        for( int k=2;k<=n;k++) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;

        }
        
        return n3;
            }
            return NULL;
}
