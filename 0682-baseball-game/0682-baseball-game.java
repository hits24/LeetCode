class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C")){
                st.pop();
            } else if(operations[i].equals("D")){
                int dbl = 2*st.peek();
                st.push(dbl);
            } else if(operations[i].equals("+")){
                int top = st.pop();
                int sum = top + st.peek();
                st.push(top);
                st.push(sum);
            } else {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int totalSum = 0;
        while(!st.isEmpty()){
            totalSum += st.pop();
        }
        return totalSum;
        
    }
}