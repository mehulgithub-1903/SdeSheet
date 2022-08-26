https://www.freecodecamp.org/news/how-to-use-arrays-binarysearch-in-java/

class Solution {
    public int maxEnvelopes(int[][] e) {
        Arrays.sort(e, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int dp[]=new int[e.length];
        dp[0]=e[0][1];
      int result = 0;
        for (int [] it : e) {
            int index = Arrays.binarySearch(dp, 0, result, it[1]);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = it[1];
            if (index == result)
                result += 1;
        }
        return result;   
    }
}
