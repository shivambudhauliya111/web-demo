// Last updated: 8/22/2025, 4:45:13 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n = nums.length;


        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int threshold = n / 3;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : countMap.entrySet()) {
            if (e.getValue() > threshold) {
                result.add(e.getKey());
            }
        }

        return result;
    }
}