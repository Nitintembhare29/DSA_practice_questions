class Solution {
    List<List<Integer>> mainList = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int a=0; a<n-3; a++){
            if(a>0 && nums[a]==nums[a-1]) continue;
           
            threeSum(nums,a,(long)target-nums[a]);
        }
        
        return mainList;
    }
     
    public void threeSum(int[] nums, int a,long target) {
        int n = nums.length;
        for(int b=a+1; b<n-2; b++){
            if(b>a+1 && nums[b]==nums[b-1]) continue;
           
            twoSum(nums,a,b,target-nums[b]);
        }
        
    }
    
     public void twoSum(int[] nums, int a, int b, long target) {
       
        int n = nums.length;
        int c =b+1, d=n-1;
        while(c<d){                           //[-1,0,1,2,-1,-4]
            long sum = nums[c]+nums[d];        //[-4,-1,-1,0,1,2]
            if(sum>target){                             
                d--;                                        
            }
            else if(sum<target){                                
                c++;
            }
            else{
                ArrayList <Integer> list = new ArrayList<>();
                list.add(nums[a]);
                 list.add(nums[b]);
                list.add(nums[c]);
                list.add(nums[d]);
                mainList.add(list);
                while(c<d && nums[c]==nums[c+1])
                        c++;                    
                while(c<d && nums[d]==nums[d-1])
                        d--;
                    c++;
                    d--;
            }
        }
        
        
      
        
    }
}