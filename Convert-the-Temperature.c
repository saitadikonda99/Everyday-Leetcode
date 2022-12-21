/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
double* convertTemperature(double celsius, int* returnSize){

    double k   = celsius + 273.15;
    double s1 = celsius * 1.80 + 32.00;

    double *k1;
    kusu =(double*)malloc( sizeof(double) * 2 );
      *returnSize = 2;
    k1[0] = k;
    k1[1] = s1;
    
    return k1;

}
