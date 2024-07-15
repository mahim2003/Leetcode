import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    List<List<Integer>> finalList = new ArrayList<>();
    Arrays.sort(nums);

    for(int i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int left=i+1;
        int right= nums.length-1;
        while(left<right){
            if(nums[i]+nums[left]+nums[right]==0){
            ArrayList<Integer>tempList = new ArrayList<>();
            tempList.add(nums[i]);
            tempList.add(nums[left]);
            tempList.add(nums[right]);
            finalList.add(tempList);
            while(left<right && nums[left]==nums[left+1]){
                left++;
            }
            while(left<right && nums[right]==nums[right-1]){
                right--;
            }
            left++;
            right--;
           
            }
            else if(nums[i]+nums[left]+nums[right]>0){
                right--;
            }
            else{
                left++;
            }

        }
    }
    return finalList;
    
    }
}

/*
 * Problem Number: 15
 * Link: https://leetcode.com/problems/3sum/
 */