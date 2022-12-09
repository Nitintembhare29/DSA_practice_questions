class Solution {
    public int longestOnes(int[] nums, int k) {
       int count =0,ans = 0;
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==0){
                count++;    
            }
            while(count>k){
               if(nums[i]==0){
                   count--;
               }
                   i++;
                  
            }
           ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}

//      [1,1,1,0,0,0,1,1,1,1,0]