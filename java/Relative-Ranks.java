class Solution {
    public String[] findRelativeRanks(int[] score) {
             
             String[] ans = new String[score.length];
        for( int k=0; k<score.length; k++ ) {
            int count = 0;
            
            for( int s=0; s<score.length; s++ ) {

                if( score[k] > score[s] ) {
                    count++;
                }
                
            }
            
            if( count == score.length -1) {
                ans[k] = "Gold Medal";
            }
            else if( count == score.length -2) {
                   ans[k] = "Silver Medal";
            }
            else if( count == score.length -3) {
                   ans[k] = "Bronze Medal";
            }
            else {
                  
                  ans[k] = score.length-count+"";
            }
            
        }
        return ans;
    }
}
