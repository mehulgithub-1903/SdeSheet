class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        boolean visited[][]=new boolean[m][n];
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!='0' && !visited[i][j]){
                    count++;
                    dfs(m,n,grid,i,j,visited);
                }
            }
        }
        return count;
        
    }
    public void dfs(int m,int n,char grid[][],int i,int j,boolean [][] visited){
        if(i>=m || j>=n || j<0 || i<0){
            return;
        }
        
        if(grid[i][j]=='0') return;
        if(visited[i][j])  return;
        visited[i][j]=true;
 
        dfs(m,n,grid,i+1,j,visited);
        dfs(m,n,grid,i-1,j,visited);
        dfs(m,n,grid,i,j+1,visited);
        dfs(m,n,grid,i,j-1,visited);
        
        
    }
}
