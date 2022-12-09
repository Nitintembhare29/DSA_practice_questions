class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);  
        }
        int ans = 0;
       
          for(int i=0; i<nums.length; i++){
             if(!set.contains(nums[i]-1)){
                  int j=nums[i];
             while(set.contains(j)){
                 j++;
             }
              ans = Math.max(j-nums[i],ans);
             }
        }
        return ans;
    }
}