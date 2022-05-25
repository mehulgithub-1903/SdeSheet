import java.util.*;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
    for(int i=0;i<n+1;i++) adjList.add(new ArrayList<Integer>());
    for(int i=0;i<edges.size();i++){ 
        adjList.get(edges.get(i).get(0)).add(edges.get(i).get(1));
    }

     boolean visited[]=new boolean[n+1];
    Arrays.fill(visited,false);
    boolean dfsvisited[]=new boolean[n+1];
    Arrays.fill(visited,false);
for(int i=1;i<n+1;i++){
        if(!visited[i]) 
        {
            
            if(!cycle(dfsvisited,visited,i,adjList)){
                return true;
            }
        
        }

    }
    return false;
  }
  public static boolean cycle(boolean dfsvisited[],boolean visited[],int node,ArrayList<ArrayList<Integer>> adjList){
    visited[node]=true;
    dfsvisited[node]=true;
    boolean ans=true;
    for(int it:adjList.get(node)){
        if(!dfsvisited[it]){
            ans=ans && cycle(dfsvisited,visited,it,adjList);
        }else{
            return false;
        }
    }
    dfsvisited[node]=false;
    return ans;
  }
}
