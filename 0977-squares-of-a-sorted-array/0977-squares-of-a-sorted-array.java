class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int result[] = new int[nums.length];
        int k=nums.length-1;
        while(left<=right){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(leftSq>rightSq){
                result[k]=leftSq;
                left++;
            } else {
                result[k]=rightSq;
                right--;
            }
            k--;
        }
        return result;
    }
}