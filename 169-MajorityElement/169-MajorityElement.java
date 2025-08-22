// Last updated: 8/22/2025, 4:45:16 PM
class Solution {
    public int majorityElement(int[] nums) {   
    int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();  
        int majorityCount = n / 2;  

        for (int r : nums) {  
            countMap.put(r, countMap.getOrDefault(r, 0) + 1);  
            if (countMap.get(r) > majorityCount) {  
                return r;  
            }  
        }  
        
        return 0;
    }  
}    
    
