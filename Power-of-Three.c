bool isPowerOfThree(int n){
    
    for( int k=0; k<sqrt(n); k++ ) {

     if( pow( 3 , k) == n )  
         return true;
    }
 
return false;
    

}
