class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
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
    
        
        if(arr[ind]<=target){
//           take
            ds.add(arr[ind]);
            solve(ind+1,arr,result,ds,target-arr[ind]);
//             not take 
            ds.remove(ds.size()-1);
//             ek baar decide kar liya nahi lena to uske sare occurences ko skip karna hai 
            while(ind<arr.length-1 && arr[ind]==arr[ind+1]) ind++;
            solve(ind+1,arr,result,ds,target);
        }
        
    
	}
}
