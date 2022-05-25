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
                if(cycle(visited,i,adjList)){
                    return "Yes";
                }
            
            }

        }
        return "No";
    }
    public static boolean cycle(boolean []visited,int node,ArrayList<ArrayList<Integer>> adjList){
            Node root=new Node(node,-1);
            Queue<Node> q=new LinkedList<Node>();
            q.add(root);
            visited[node]=true;
            while(!q.isEmpty()){
                Node x=q.poll();
                int val=x.first;
                int par=x.second;

                for(int it:adjList.get(val)){
                       
                    if(!visited[it]){
                        visited[it]=true;
                        Node newNode=new Node(it,val);
                        q.add(newNode);
                    }else{
                        if(par!=it) return true;
                        
                    }
                }
            
            }
            return false;
            
        }
    
}
