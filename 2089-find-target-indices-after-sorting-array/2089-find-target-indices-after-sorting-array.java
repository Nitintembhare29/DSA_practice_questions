class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         ArrayList<Integer> l1 = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                l1.add(i);
            }
        }
        return l1;
    }
}