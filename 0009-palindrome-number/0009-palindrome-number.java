class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }

        int rev = 0;
        int temp = x;

        while(x>rev){
            rev = rev * 10 + x % 10;  //1,12
            x = x/10;  //12
        }

        return (rev == x)  || (x==rev/10);
    }
}