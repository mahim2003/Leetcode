import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int n = map.get(nums[i]);
            map.put(nums[i],n+1);
        }
        else{
            map.put(nums[i],1);
        }
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n2) - map.get(n1));
        
        for (int n : map.keySet()) {
            heap.add(n);
        }
        
        int[] topK = new int[k];
        for (int i = 0; i <k; i++) {
            topK[i] = heap.poll();
        }
        
        return topK;


    
    }
}

/*
 * Problem Number: 347
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 */