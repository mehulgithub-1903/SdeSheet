class Solution {
  public boolean isBipartite(int[][] graph) {
      int v=graph.length;
      
      int []color=new int[v];

      Arrays.fill(color,-1);
      for(int i=0;i<v;i++){
          if(color[i]==-1){
           if(!bipartCheck(0,color,i,graph)) return false;

          }
      }

      return true;

  }
  public boolean bipartCheck(int c,int [] color,int par,int[][] graph){


    color[par]=c;
    for(int e:graph[par]){
        if(color[e]==-1){
              if(!bipartCheck(1-color[par],color,e,graph)) return false;
        }else{
             if(color[e]==color[par]){
                return false;
             }   
        }                    
    }    
    return true;

  }
}
