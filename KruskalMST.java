import java.lang.reflect.Array;
import java.util.Collections;
import java.util.PriorityQueue;

import javafx.scene.layout.Priority;

public class Solution {
    static int[] parent;

    static class edge{
        int t;
        int f;
        int w;

        edge(int t,int f,int w){
            this.t=t;
            this.f=f;
            this.w=w;
        }
    }
    
    public static int kruskalMST(int n, int m, ArrayList<ArrayList<Integer>> graph) {
      
        
        PriorityQueue<edge> pq=new PriorityQueue<>((edge a,edge b)-> a.w-b.w);

        parent=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        for(ArrayList<Integer> e:graph){
            pq.add(new edge(e.get(0),e.get(1),e.get(2)));
        }

        int sum=0;
        while(!pq.isEmpty()){
            edge x=pq.poll();
            int to=x.t;
            int fr=x.f;
            int we=x.w;

            if(find(to)!=find(fr)){
                union(to, fr);
                sum+=we;
            }

        }

        return sum;
    }
    public  static void union(int x,int y){
        int xp=find(x);
        int yp=find(y);
        parent[yp]=xp;
    }
    public static int find(int x){
        if(parent[x]==x) return x;
        return find(parent[x]);
    }

}
