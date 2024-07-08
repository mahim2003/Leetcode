import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>>map = new HashMap<>();
      for (String element : strs){
        char[] charArray = element.toCharArray();
        Arrays.sort(charArray);
        String word = new String(charArray);
        if(!(map.containsKey(word))){
            map.put(word,new ArrayList<>());
        }
        
        map.get(word).add(element);
        
      }
      return new ArrayList<>(map.values());
    }
}

/*
 * Problem Number: 49
 * Link: https://leetcode.com/problems/group-anagrams/description/
 */