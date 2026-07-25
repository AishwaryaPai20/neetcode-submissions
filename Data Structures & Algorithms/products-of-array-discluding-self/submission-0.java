class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] product = new int[nums.length];
          
        int left = 1;
        for(int i = 0; i < nums.length; i++) {
            product[i] = left; 
            left *= nums[i];   
        } 
       
        int right = 1; 
        for(int i = nums.length - 1; i >= 0; i--) {
            product[i] *= right; 
            right *= nums[i];    
        }
        
        return product;
    }
}