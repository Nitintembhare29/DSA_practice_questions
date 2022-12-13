class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
	int start = 0;
	int extraPetrol = 0;
	int requiredPetrol = 0;
	for(int i=0; i<n; i++){
	    extraPetrol+=gas[i]-cost[i];
	    if(extraPetrol<0){
	        start = i+1;
	        requiredPetrol+=extraPetrol;
	        extraPetrol = 0;
	    }
	}
	if(extraPetrol+requiredPetrol>=0){
	    return start;
	}
	return -1;
    }
}