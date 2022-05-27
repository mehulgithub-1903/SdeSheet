import java.util.*;

public class Solution 
{
    static class Pair{
        int f;
        int s;

        public Pair(int f,int s){
            this.f=f;
            this.s=s;
        }
    }
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int v, int e, ArrayList<ArrayList<Integer>> g)
    {


        ArrayList<ArrayList<Pair>>  adj=new ArrayList<>();
        for(int i=0;i<v+1;i++) adj.add(new ArrayList<Pair>());

        for(ArrayList<Integer> x:g){
            adj.get(x.get(0)).add(new Pair(x.get(1), x.get(2)));
            adj.get(x.get(1)).add(new Pair(x.get(0), x.get(2)));
                
        }

        int [] key=new int[v+1];
        Set<Integer> mst=new HashSet<>();
        int parent[]=new int[v+1];
        Arrays.fill(key,Integer.MAX_VALUE);
        Arrays.fill(parent,-1);

        parent[1]=-1;
        mst.add(1);
        key[1]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((Pair a,Pair b)->a.s-b.s);
        pq.add(new Pair(1,0));
        while(!pq.isEmpty())
        {
            Pair x=pq.poll();
            mst.add(x.f);

            for(Pair ne:adj.get(x.f)){
                if(!mst.contains(ne.f) && key[ne.f]>ne.s){
                    parent[ne.f]=x.f;
                    key[ne.f]=ne.s;
                    pq.add(new Pair(ne.f,ne.s));
                }
            }

        }
      
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=2;i<v+1;i++){
            ArrayList<Integer> al=new ArrayList<>();
            al.add(parent[i]);
            al.add(i);
            al.add(key[i]);
            ans.add(al);
        }
          
        return ans;
    }
}
