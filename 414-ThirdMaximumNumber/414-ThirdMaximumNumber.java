// Last updated: 24/06/2026, 14:29:04
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        return list.size() < 3 ? list.get(0) : list.get(2);
    }
}
