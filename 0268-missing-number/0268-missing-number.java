class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int actualSum=0;
        for(int num: nums){
            actualSum+= num;
        }
        int expectedSum=n*(n+1)/2;
        int missing=expectedSum-actualSum;
        return missing;
    }
}