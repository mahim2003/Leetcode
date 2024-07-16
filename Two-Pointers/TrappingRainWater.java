class Solution {
    public int trap(int[] height) {
     if(height.length<=2){
        return 0;
     }   
     int sum=0;
     int left=0;
     int right=height.length-1;
     int leftMax=height[left];
     int rightMax= height[right];
     while(left<right){
        if(height[left]<height[right]){
            if(height[left]>leftMax){
                leftMax=height[left];
            }
            else{
                sum=sum+leftMax-height[left];
            }
            left++;
        }
        else{
            if(height[right]>rightMax){
                rightMax=height[right];
            }
            else{
                sum=sum+rightMax-height[right];
            }
            right--;
        }
     } 
     return sum;
    }
}

/*
 * Problem Number: 42
 * Link: https://leetcode.com/problems/trapping-rain-water/
 */