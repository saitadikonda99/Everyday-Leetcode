int commonFactors(int a, int b){

    int check = 0;
    for( int k=1; k<=1000; k++ ) {
        if( a % k == 0 && b % k == 0 ) {
            check++;
        }
    }
 return check;
}
