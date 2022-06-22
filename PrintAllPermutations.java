class Solution {
		public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
			ArrayList<Integer> ip=new ArrayList<>();
			for(int x:nums){
			ip.add(x);
			}
			solve(ip,result,0);
			return result;
		}
		public void solve(ArrayList<Integer> nums,List<List<Integer>> result,int start){
			if(start==nums.size()){
				result.add(new ArrayList<>(nums));
				return;
			}
			
			for(int i=start;i<nums.size();i++){
				int x=nums.get(start);
				nums.set(start,nums.get(i));
				nums.set(i,x);
				solve(nums,result,start+1);
				x=nums.get(start);
				nums.set(start,nums.get(i));
				nums.set(i,x);	
		}
		}
}
