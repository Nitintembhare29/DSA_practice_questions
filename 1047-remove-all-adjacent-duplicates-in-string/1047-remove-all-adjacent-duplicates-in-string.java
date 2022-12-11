class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size()>0 && ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
            String ans = "";
            while(st.size()>0){
            ans = st.pop() + ans;  // in stack ac we want ca
            }                      //ans =c+""  , ans =a+c return ac 
        return ans;
    }
}