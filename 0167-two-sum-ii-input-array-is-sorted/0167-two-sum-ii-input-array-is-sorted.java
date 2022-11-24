class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        
        while(i<j){
            int cSum = numbers[i]+numbers[j];
            
            if(cSum<target){
                i++;
            }
            else if(cSum>target){
                j--;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{};
    }
}