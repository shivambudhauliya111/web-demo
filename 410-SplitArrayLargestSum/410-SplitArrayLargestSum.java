// Last updated: 8/22/2025, 4:44:57 PM
public class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, mid, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums, int maxSum, int m) {
        int subarrayCount = 1;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                currentSum = num;
                subarrayCount++;
                if (subarrayCount > m) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(solution.splitArray(nums, m));  
    }
}
