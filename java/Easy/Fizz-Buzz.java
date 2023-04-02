class Solution {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> ans = new ArrayList<>();

        for( int k=1; k<=n; k++ ) {
            if( k % 3 == 0 && k % 5 == 0) {
                ans.add("FizzBuzz");
            }
                else if( k % 3 == 0 ) {
                    ans.add("Fizz");
                }
                    else if( k % 5 == 0 ) {
                    ans.add("Buzz");
                }
                else {
                    ans.add(k+"");
                }
            }
            return ans;
        }
    
}
