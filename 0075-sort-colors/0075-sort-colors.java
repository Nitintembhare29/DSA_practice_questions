class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l=-1;
        int m=0;
        int r=n-1;
       
        while(m<=r){
            if(nums[m]==2){
                swap(nums,m,r);
                r--;
            }
            else if(nums[m]==0){
                l++;
                swap(nums,l,m);
                 m++;   
            }
            else{
                m++;
            }
        }
    }
}