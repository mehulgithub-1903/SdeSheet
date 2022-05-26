class Solution {
  public boolean isBipartite(int[][] graph) {
      int v=graph.length;
      
      int []color=new int[v];

      Arrays.fill(color,-1);
      for(int i=0;i<v;i++){
          if(color[i]==-1){
           if(!bipartCheck(color,i,graph)) return false;

          }
      }

      return true;

  }
  public boolean bipartCheck(int [] color,int node,int[][] graph){

    color[node]=0;
    Queue<Integer> q=new LinkedList<Integer>();
    q.add(node);
    while(!q.isEmpty()){
      Integer x=q.poll();

      for(int ne:graph[x]){
        if(color[ne]==-1){
          color[ne]=1-color[x];
          q.add(ne);
        }else{
          if(color[x]==color[ne]){
            return false;
          }
        }
      }
    }

    return true;

  }
}
