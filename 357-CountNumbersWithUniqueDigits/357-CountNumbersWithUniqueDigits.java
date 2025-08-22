// Last updated: 8/22/2025, 4:44:59 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int count = 10, uniqueDigits = 9, availableNumber = 9;
        while (n-- > 1 && availableNumber > 0) {
            uniqueDigits = uniqueDigits * availableNumber;
            count += uniqueDigits;
            availableNumber--;
        }
        return count;
    }
}