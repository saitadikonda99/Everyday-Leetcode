bool checkPerfectNumber(int num){
int sum = 0;
for( int k=1; k<= num/2; k++ ) {
    if( num % k == 0) 
     sum += k; 
     
}
 return sum == num;
}
