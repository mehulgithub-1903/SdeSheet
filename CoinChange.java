class Solution {
    Integer dp[][];
    public int coinChange(int[] coins, int amount) {
    
        dp=new Integer[coins.length+1][amount+1];
        
        Arrays.sort(coins);
        int a= rec(coins,coins.length,amount);
        if(a==Integer.MAX_VALUE-1) return -1;
        else return a;
    }
    public int rec(int []coins,int n,int target){
        if(n==0){
            return Integer.MAX_VALUE-1;
        }
        if(target==0){
            return 0;
        }
        if(dp[n][target]!=null){
            return dp[n][target];
        }
        if(coins[n-1]<=target){
        return dp[n][target]=Math.min(rec(coins,n-1,target),1+rec(coins,n,target-coins[n-1]));
        }
        else{
            return dp[n][target]=rec(coins,n-1,target);
        }
        
    }
}
