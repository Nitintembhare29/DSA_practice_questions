class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }
            else{
                // remove all asteriods which has less wieght
                while(st.size()>0 && st.peek()>0 && st.peek()< -arr[i]){  // abs value
                    st.pop();
                } 
                // check equal weight case
                if(st.size()>0 && st.peek()== -arr[i]){
                    st.pop();
                }
                // empty stack or same direction -ve element
                else if(st.size()==0 || st.peek()<0){
                    st.push(arr[i]);
                }
            }
        }
        int size = st.size();
        int ans[] = new int[size];
        // store element from backward
        for(int i=size-1; i>=0; i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}