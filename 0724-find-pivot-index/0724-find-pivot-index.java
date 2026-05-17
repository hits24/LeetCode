class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int result =0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int pivot = nums[i];
            int rightSum = totalSum -leftSum - pivot;
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        } 
        
        return -1;
        
    }
}