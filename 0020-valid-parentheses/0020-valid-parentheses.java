class Solution {
    public boolean isMatch(char open, char close){
        if(open=='(' && close==')'){
            return true;
        }
       else if(open=='{' && close=='}'){
            return true;
        }
        else if(open=='[' && close==']'){
            return true;
        }
        return false;
    
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // if open bracket then push
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            // check if top char is same as curr char pop it
            else{
                if(st.size()>0 && isMatch(st.peek(),ch)){ // check open & close bracket
                    st.pop();  
                } else{
                    return false;
                }
                   
            }
        }
      return st.empty();
    }
                   
}