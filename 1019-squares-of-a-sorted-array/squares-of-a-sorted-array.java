class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];

        int l = 0;
        int r = n - 1;
        int k = n - 1;

        while (l <= r) {
            
            int leftSqr = nums[l] * nums[l];
            int rightSqr = nums[r] * nums[r];

            if (leftSqr > rightSqr) {
                result[k] = leftSqr;
                l++;
            } else {
                result[k] = rightSqr;
                r--;
            }

            k--;
        }

        return result;
    }
}
