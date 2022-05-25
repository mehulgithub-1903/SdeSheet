import java.util.*;
public class Solution 
{
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int n, int e) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++) adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.size();i++){ 
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }

        Stack<Integer> st=new Stack<Integer>();
        boolean[]visited =new boolean[n];
        for(int i=0;i<n;i++){
               if(!visited[i]){
                   topoSort(i,adj,visited,st);
               }
        }
        
         ArrayList<Integer> al=new ArrayList<Integer>();
            while(!st.isEmpty()){
                al.add(st.pop());
            }
            return al;
    }
    public static void topoSort(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[],Stack<Integer> st){
        visited[node]=true;
        
        for(int it:adj.get(node)){
            if(!visited[it]) topoSort(it,adj,visited,st);
        }
        st.push(node);
    }
}
