class Solution {
    public List<Boolean> 
kidsWithCandies(int[] candies, int 
extraCandies) {
        ArrayList<Boolean> list = new 
ArrayList<>();
        for (int i : candies) {
            int temp = i + extraCandies;
            boolean inthat = true;

            for (int candy : candies) {
                if (candy > temp) {
                    inthat = false;
                    break;
                } else {
                    continue;
                }
            }
            if (inthat) list.add ( true 
);
            else list.add ( false );

        }
        return list;
    }
}
