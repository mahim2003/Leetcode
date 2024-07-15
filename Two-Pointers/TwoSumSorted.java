class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
    int[] array = new int[2];
    int left=0;
    int right=numbers.length-1;
    while(left<right){
        if(numbers[left]+numbers[right]==target){
            array[0]=left+1;
            array[1]=right+1;
            return array;
        }
        else if(numbers[left]+numbers[right]>target){
            right--;
        }
        else{
            left++;
        }
    }
    return array;
    
    }
}

/*
 * Problem Number: 167
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */