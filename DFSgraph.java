import java.util.*;

public class Solution {
    public static 
    ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<v;i++) adjList.add(new ArrayList<Integer>());
        for(ArrayList<Integer> x:edges){
            adjList.get(x.get(0)).add(x.get(1));
            adjList.get(x.get(1)).add(x.get(0));
            
        }



        //adjList  
        boolean visited[]=new boolean[v];
        Arrays.fill(visited,false);
        //boolean

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<v;i++){
            if(!visited[i]) 
            {
                visited[i]=true;
                ArrayList<Integer> singleComponent=new ArrayList<>();
                dfs(visited,i,adjList,singleComponent);
                ans.add(singleComponent);
            }

        }
        return ans;
    }
    public static void dfs(boolean visited[],int node,ArrayList<ArrayList<Integer>> adjList,ArrayList<Integer> singleComponent){
        visited[node]=true;
        singleComponent.add(node);   
        for(int ne:adjList.get(node)){
            if(!visited[ne]) {
                dfs(visited, ne, adjList,singleComponent);
            }
        }
    }
}
