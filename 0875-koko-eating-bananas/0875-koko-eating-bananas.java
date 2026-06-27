class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = max(piles);

        while(low <= high){

            int mid = low + (high - low) / 2;

            long totalHours = totalHours(piles, mid);

            if(totalHours <= h){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }

        return low;
    }

    private long totalHours(int[] piles, int k){

        long hours = 0;

        for(int pile : piles){
            hours += (pile + k - 1) / k;
        }

        return hours;
    }

    private int max(int[] piles){

        int max = piles[0];

        for(int pile : piles){
            max = Math.max(max, pile);
        }

        return max;
    }
}