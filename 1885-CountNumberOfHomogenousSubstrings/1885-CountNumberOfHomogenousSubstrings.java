// Last updated: 8/22/2025, 4:44:40 PM
class Solution {
    public int countHomogenous(String str) {
        long sum = 0;
        int n = 1;
        int size = str.length();
        final int max = 1000000007;

        for (int i = 1; i < size; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                n++;
            } else {
                sum = sum + (long) n * (n + 1) / 2;
                n = 1;
            }
        }

        sum = sum + (long) n * (n + 1) / 2;
        sum = sum % max;
        return (int) sum;
    }
}
