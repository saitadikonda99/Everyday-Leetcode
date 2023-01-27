int smallestEvenMultiple(int n){

for( int k=1; k<=5; k++ ) {
    if( ( n * k )% 2 == 0  )
    return n*k;

}
return NULL;
}
