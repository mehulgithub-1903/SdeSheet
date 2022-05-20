class Solution {
    Boolean dp[][];

    public boolean canPartition(int[] nums) {
    
        
        int a=0;
        for(int e:nums){
            a+=e;
        }
            if(a%2!=0) return false;
        dp=new Boolean[nums.length+1][a+1];
       
            dp[0][0]=true;
            
            return rec(nums,nums.length,0,a);
    }
    public boolean rec(int []nums,int n,int s,int ts){
        if(ts==2*s) return dp[n][s]=true;
        
        if(n==0) return false;
        if(dp[n][s]!=null) return dp[n][s];
        return dp[n][s]=(rec(nums,n-1,s+nums[n-1],ts) || rec(nums,n-1,s,ts));
        
    }
}
