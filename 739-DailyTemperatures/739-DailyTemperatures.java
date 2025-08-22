// Last updated: 8/22/2025, 4:44:54 PM
class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] ans = new int[temperatures.length];
    Deque<Integer> stack = new ArrayDeque<>();
 for (int i = 0; i < temperatures.length; ++i) {
      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        final int index = stack.pop();
        ans[index] = i - index;
      }
      stack.push(i);
    }

    return ans;
  }
}