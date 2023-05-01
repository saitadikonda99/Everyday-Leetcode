class Solution {
    public double average(int[] salary) {
        
        Arrays.sort(salary);
        int sum = 0;
        int s = 0;
        for( int k=1; k<salary.length-1; k++ ) {
            sum += salary[k];
            s++;
        }
        double avg = (double)sum / s;
        return avg;
    }
}
