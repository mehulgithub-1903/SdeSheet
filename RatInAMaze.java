
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

        for(int i=0;i<4;i++){
            if(0<=row+dr[i] && row+dr[i]<n && 0<=col+dc[i]&& col+dc[i]<n){
                if(!visited[row+dr[i]][col+dc[i]] && grid[row+dr[i]][col+dc[i]]!=0){
                    visited[row+dr[i]][col+dc[i]]=true;
                    if(dr[i]==0){
                        if(dc[i]==1){
                            s+="R";
                        }else{
                            s+="L";
                        }
                    }
                    if(dc[i]==0){
                        if(dr[i]==1){
                            s+="D";
                        }else{
                            s+="U";
                        }
                    }
                    solve(s,grid,visited,n,row+dr[i],col+dc[i],ans);
                    visited[row+dr[i]][col+dc[i]]=false;
                    s=s.substring(0,s.length()-1);
                }
                
            }
        }

        
    }
}