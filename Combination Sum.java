class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// Arrays.sort(candidates);
		solve(0,candidates, result,new ArrayList<>(), target);

		return result;


    }
	public void solve(int ind,int arr[],List<List<Integer>> result,ArrayList<Integer> ds,int target)
	{
		if(target==0){
                result.add(new ArrayList<>(ds));
            return;
            }
        if(ind==arr.length){
            
            return;
        }
    
        // take 
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            solve(ind,arr,result,ds,target-arr[ind]);
            ds.remove(ds.size()-1);
            solve(ind+1,arr,result,ds,target);
        }
        else {
            // not able to take
            solve(ind+1,arr,result,ds,target);
        }
    
	}
}
