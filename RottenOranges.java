import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        
       
        int ans=0;
        int fresh=0;
        Queue<int[]> q=new Queue<int[]>();
        int visited[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            else if(grid[i][j]==1){
            fresh++;
            }
            }
        }

        if(fresh==0){
            return 0;
        }
        ans=bfs(q,grid);

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
    int bfs(Queue<int[]> q,int [][]grid){
        int time=0;
        
        int dr[]=new int[]{1,-1,0,0};
        int dc[]=new int[]{0,0,1,-1};
        while(!q.isEmpty()){
            int s=q.size();
            int f=0;
            for(int k=0;k<s;k++){
                int[] temp=q.poll();          
                for(int ii=0;ii<4;ii++){
                    
                    if((temp[0]+dr[ii])<grid.length && (temp[0]+dr[ii])>=0 && (temp[1]+dc[ii])>=0 && (temp[1]+dc[ii])<grid[0].length){
                        if(grid[temp[0]+dr[ii]][temp[1]+dc[ii]]==1){ //fresh neigh
                            
                            f++;
                            grid[temp[0]+dr[ii]][temp[1]+dc[ii]]=2;
                            q.add(new int[]{temp[0]+dr[ii],temp[1]+dc[ii]});
                        }
                    }
                }
                
            }
            if(f>0) time++;
        }
        return time;
    }
}
