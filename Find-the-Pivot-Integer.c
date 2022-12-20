int pivotInteger(int n){

    for( int k=1; k<=n; k++ ) {
        int sum1 = 0;
        int sum2 = 0;
        for( int s=1; s<=n; s++ ){
                if( s < k )
                sum1 += s;
                if( s > k )
                sum2 += s;
        }
        if( sum1 == sum2 ) 
         return k;
         
    }
return -1;
}
