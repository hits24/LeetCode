class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        String cleaned = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                cleaned += Character.toLowerCase(ch);
            }
        }

        int index = cleaned.length()-1;
        for(int i=0; i<cleaned.length()/2; i++){
            if(cleaned.charAt(i)==cleaned.charAt(index)){
                index--;
            } else {
                return false;
            }
        }
        return true;
    }
}