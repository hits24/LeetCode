class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result=-1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count+1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                result=i;
                break;
            }
        }
        return result;
    }
}