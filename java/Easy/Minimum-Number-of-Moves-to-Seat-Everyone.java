class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
      
      Arrays.sort(seats);
      Arrays.sort(students);
      int s = 0;
        for( int k=0; k<seats.length; k++ ) {
                s += Math.abs(seats[k] - students[k]);
        }
        return s;
    }
}
