class Solution {
    static String ans;
    static int dr[]=new int[]{0,0,-1,1};
    static int dc[]=new int[]{1,-1,0,0};
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        
    ArrayList<String> result = new ArrayList<String>();
    boolean visited[][]=new boolean[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            visited[i][j] = false;
        }
    }
    visited[0][0]=true;
    if(m[0][0]==0) return new ArrayList<String>();
    
    solve("",m, visited,n,0,0,result);
    
    return result;
    }
    public static void solve(String s,int grid[][],boolean visited[][],int n,int row,int col,ArrayList<String> ans){
        if(row==n-1 && col==n-1){
          ans.add(s);
            return;
        }   
        String k="RLUD";
        for(int i=0;i<4;i++){
            int nr=row+dr[i];
            int nc=col+dc[i];

            if(0<=nr && nr<n && 0<=nc&& nc<n && !visited[nr][nc] && grid[nr][nc]!=0){

                visited[row][col]=true;
                solve(s+k.charAt(i),grid,visited,n,nr,nc,ans);
                visited[row][col]=false;
            }
        }

        
    }
}
