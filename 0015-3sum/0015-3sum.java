class Solution {
    List<List<Integer>> mainList = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
           
            twoSum(nums,i,-nums[i]);
        }
        return mainList;
    }
    
     public void twoSum(int[] nums, int i, int target) {
       
        int n = nums.length;
        int j =i+1, k=n-1;
        Arrays.sort(nums);
        while(j<k){
            int sum = nums[j]+nums[k];
            if(sum>target){
                k--;
            }
            else if(sum<target){
                j++;
            }
            else{
                ArrayList <Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                mainList.add(list);
                while(j<k && nums[j]==nums[j+1])
                        j++;                    
                while(j<k && nums[k]==nums[k-1])
                        k--;
                    j++;
                    k--;
            }
        }
        
        
      
        
    }
}