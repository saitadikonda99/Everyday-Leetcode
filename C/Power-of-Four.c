 bool isPowerOfFour(int n){
    
    for( int k=0; k<sqrt(n); k++ ) {

     if( pow( 4 , k) == n )  
         return true;
    }
 
return false;
    

}
