int addDigits(int num){
       int sum;
    while(  num > 9 ) {
            sum = 0;
        while( num >0 ) {
        int rem = num % 10;
        sum = sum + rem;
        num = num/10;
    } 
       num = sum;
    }


return num;
}
