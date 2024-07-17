import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int finalCounter = 0;
        int tracker = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                tracker = Math.max(tracker, map.get(c) + 1);
            }
            map.put(c, i);
            finalCounter = Math.max(finalCounter, i - tracker + 1);
        }
        
        return finalCounter;
    }
}

/*
 * Problem Number: 3
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */