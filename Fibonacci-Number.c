int fib(int n){
    int n1 = 0;
    int n2 = 1;
    int n3 = n1+n2;
    if( n == 0 )
      return n;
      else {
for( int k=2; k<n; k++ ) {
    n1 = n2;
    n2 = n3;
    n3 = n1 + n2;
    
}
       

return n3;
     
      }
      return NULL;
}
