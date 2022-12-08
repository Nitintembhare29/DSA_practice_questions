class Solution {
    public char isMatch(char open){
        if(open=='('){
            return ')';
        }
        else if(open=='{'){
            return'}';
        }
        
      return ']';
    
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
                if(st.size()>0 && ch==isMatch(st.peek())){
                    st.pop();  
                } else{
                    return false;
                }
                   
            }
        }
       if(st.empty()){
           return true;
       } 
        return false;
    }
                   
}