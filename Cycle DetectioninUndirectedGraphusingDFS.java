import java.util.*;
public class Solution {
    static class Node{
        int first;
        int second;

        public Node(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static String cycleDetection(int[][] edge, int n, int m) {
      
        
       ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n+1;i++) adjList.add(new ArrayList<Integer>());
        for(int i=0;i<m;i++){ 
            adjList.get(edge[i][0]).add(edge[i][1]);
            adjList.get(edge[i][1]).add(edge[i][0]);
        }
         boolean visited[]=new boolean[n+1];
        Arrays.fill(visited,false);
       
    for(int i=1;i<n+1;i++){
            if(!visited[i]) 
            {
                visited[i]=true;
                if(!cycle(-1,visited,i,adjList)){
                    return "Yes";
                }
            
            }

        }
        return "No";
    }
    public static boolean cycle(int par,boolean []visited,int node,ArrayList<ArrayList<Integer>> adjList){
            visited[node]=true;

            boolean ans=true;
            for(int it:adjList.get(node)){
                if(!visited[it]){
                    ans=ans && cycle(node,visited,it,adjList);
                }else{
                    if(par!=it) return false;
                }
            }

            return ans;
        }
    
}
