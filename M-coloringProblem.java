class solve {
    static  ArrayList<ArrayList<Integer>> adj;
    static int color[];//color array
    public boolean graphColoring(boolean graph[][], int m, int n) {
            adj=new ArrayList<ArrayList<Integer>>();
            color=new int[n];
            for(int i=0; i<n; i++) adj.add(new ArrayList<Integer>());
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                if(graph[i][j]){
                   adj.get(i).add(j);
                adj.get(j).add(i);
                
                }
            }
        }
            Arrays.fill(color,0);

            return helper(n, 0, color, m);
        }
    public boolean helper(int n,int node,int color[],int m){

        if(node==n) return true;
        
        for(int col=1;col<=m;col++){
        if(isPossible(node,col)){
            color[node]=col;
            //rec
            if(helper(n,node+1,color,m))  return true;
            //bt
            color[node]=0;

        }
        }

        return false;
    }
    public boolean isPossible(int node,int thiscolor){
        
        for(int e:adj.get(node)){
            if(color[e]==thiscolor) return false;
        }

        return true;
    }
}
