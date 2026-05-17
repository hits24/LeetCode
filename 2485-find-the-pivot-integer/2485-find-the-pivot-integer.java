class Solution {
    public int pivotInteger(int n) {
        int totalSum=0;
        int leftSum = 0;
        for(int i=1; i<=n; i++){
            totalSum += i;
        }
        for(int i=1; i<=n; i++){
            leftSum += i;
            int rightSum = totalSum - leftSum + i;
            if(rightSum == leftSum){
                return i;
            } 
            
        }
        return -1;
    }
}