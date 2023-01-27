bool isPowerOfTwo(int n){
int k=0;
//Constraints:
// -2^31 <= n <= 2^31 - 1

for( k=0; k<31; k++ ) {
    if( n == pow(2, k)) 
     return true;
}
return false;
}
