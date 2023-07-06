class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);                     //we sort the array first in alphabetical order
        String s1 = strs[0];                   //String of first word in array
        String s2 = strs[strs.length-1];       //String of last word int array
        int idx=0;                             //index of both words 
        
         //execute the loop until we reached at the last of any one of the word
        while (idx<s1.length() && idx<s2.length()){  
            if(s1.charAt(idx) == s2.charAt(idx)){    //check if characters are matching  
                idx++;                               //if matching increament the index
            }
            else{
                break;
            }
        }

        //return the substring of characters that matched.
        return s1.substring(0,idx);                
    }
}