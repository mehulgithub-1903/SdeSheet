class Solution {
	static Integer dp[][];
    public int minPathSum(int[][] grid){

		dp=new Integer[grid.length][grid[0].length];
		
		for(Integer e[]:dp){
			Arrays.fill(e,null);
		}
		return rec(grid,0,0);
		
    } 
	public int rec(int [][] grid,int i,int j){
		if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j]; 
		
		int a=(i+1>=grid.length?1000000000:(grid[i][j]+(dp[i+1][j]==null?rec(grid,i+1,j):dp[i+1][j])));
		int b=(j+1>=grid[0].length?1000000000:(grid[i][j]+(dp[i][j+1]==null?rec(grid,i,j+1):dp[i][j+1])));
		
		return dp[i][j]=Math.min(a,b);

	}
	
}
