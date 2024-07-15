class Solution {
    public int maxArea(int[] height) {
    
    int max=0;
    int left=0;
    int right=height.length-1;
    while(left<right){
        int area=(Math.min(height[left],height[right]))*(right-left);
        max=Math.max(max,area);
        if(height[left]>height[right]){
        right--;
        }
        else{
            left++;
        }
    }
    return max;

    }
}

/*
 * Problem Number: 11
 * Link: https://leetcode.com/problems/container-with-most-water/
 */