class Solution {
    public int[] productExceptSelf(int[] nums) {
    
    int[] preproduct = new int[nums.length];
    int[] postproduct = new int[nums.length];

    int product = 1;

    for(int i=0;i<preproduct.length;i++){
        if(i==0){
            preproduct[i]=1;
        }
        else{
            preproduct[i] = product*nums[i-1];
            product=product*nums[i-1];
        }
    }
    product=1;
    for(int i=postproduct.length-1;i>=0;i--){
        if(i==postproduct.length-1){
            postproduct[i] = 1;
            postproduct[i]=postproduct[i]*preproduct[i];
        }
        else{
            postproduct[i] = nums[i+1]*product;
            postproduct[i]=postproduct[i]*preproduct[i];
            product=product*nums[i+1];
        }
    }
   
    return postproduct;
    
    }
}

/*
 * Problem Number: 238
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 */
