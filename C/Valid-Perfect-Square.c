bool isPerfectSquare(int num){
    
    for( int k=0; k<=sqrt(num); k++ ) {

     if( pow( k , 2) == num )  
         return true;
    }
 
return false;
    


}
