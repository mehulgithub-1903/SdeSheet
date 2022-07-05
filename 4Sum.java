class Solution {
   	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        int n=nums.length;
	        ArrayList<List<Integer>> q=new ArrayList<List<Integer>>();
	        Arrays.sort(nums);
	        
	        for(int i=0;i<n;i++){       
	        	for(int j=i+1;j<n;j++) {
	        		int t1=target-nums[i]-nums[j];
	        		int l=j+1;
	        		int r=n-1;
	        		
	        		while(l<r)
	        		{
	        			
	        			if(nums[l]+nums[r]<t1) l++;
	        			else if(nums[l]+nums[r]>t1) r--;
	        			else {
	        				List<Integer> al=new ArrayList<Integer>();
	        				
	        				al.add(nums[i]);
	        				al.add(nums[j]);
	        				al.add(nums[l]);
	        				al.add(nums[r]);
	        				q.add(al);
	        				
	        				while(l<r && nums[l]==al.get(2) ) l++;
	        				while(l<r && nums[l]==al.get(3) ) r--;
	        				
	        				
	        			}
	        			
	        			
	        			
	        		}
	        		
	        		while(j<n-1 && nums[j+1]==nums[j]) j++;
	        		
	        		
	        		
	        	}
	            
	        	while(i<n-1 && nums[i+1]==nums[i]) i++;
     
	            
	        }
	        
	        
	        	return q;
	        
	    }
        
        
        
        
    
}
