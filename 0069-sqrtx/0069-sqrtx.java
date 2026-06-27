class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        while(low<=high){
            int mid = low+(high-low)/2;
            long sq = 1L*mid*mid;
            if(sq==x){
                return mid;
            } else if(sq>x){
                high=mid-1;
            } else if(sq<x){
                low=mid+1;
            }
        }
        return high;
    }
}