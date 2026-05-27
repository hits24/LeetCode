class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];

        int pre_product=1;
        int suf_product=1;
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for(int i=1; i<nums.length; i++){
            pre_product = pre_product* nums[i-1];
            prefix[i]=pre_product;
        }
        for(int i=nums.length-2; i>=0; i--){
            suf_product = suf_product* nums[i+1];
            suffix[i]=suf_product;
        }
        for(int i=0; i<nums.length; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}