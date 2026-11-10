
class Solution {
    public int climbStairs(int n, int[] costs) {

        int[] dp = new int[n + 1];

        // Initialize with maximum value
        java.util.Arrays.fill(dp, Integer.MAX_VALUE);

        // Starting step
        dp[0] = 0;

        for (int i = 0; i < n; i++) {

            for (int jump = 1; jump <= 3; jump++) {

                int j = i + jump;

                if (j <= n) {

                    int cost = costs[j - 1] + jump * jump;

                    dp[j] = Math.min(dp[j],
                                     dp[i] + cost);
                }
            }
        }

        return dp[n];
    }
}
