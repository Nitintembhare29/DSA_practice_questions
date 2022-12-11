class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st = new Stack<>();// store indices
		for(int i=0; i<2*n; i++){
			// check wheather curr ele is NGE or not 
			while(st.size()>0 && arr[i%n]>arr[st.peek()]){
				ans[st.pop()]=arr[i%n];
				 
			}
			// if not greater then store index
            if(i<n){
			   st.push(i);
            }
		}
        return ans;
    }
}
    
 
            
        