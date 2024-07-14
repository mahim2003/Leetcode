import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
    
    HashSet<Integer>set = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }
    int max = 0;
    for(int num: nums){
        if(!set.contains(num-1)){
            int currentValue = num;
            int counter = 1;
        
        while(set.contains(currentValue+1)){
            currentValue++;
            counter++;
        }
        max=Math.max(max,counter);
        }
        
    }
    return max;
    }
}   

/*
 * Problem Number: 128
 * Link: https://leetcode.com/problems/longest-consecutive-sequence/
 */