import java.util.*;
public class Solution {
    
  static class Pair{
    int f;//val
    int s;//weight

    public Pair(int f,int s){
      this.f=f;
      this.s=s;
    }
  }
    public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int v, int e, int source){
    ArrayList<ArrayList<Pair>> adj =new ArrayList<ArrayList<Pair>>();

    for(int i=0;i<v;i++) adj.add(new ArrayList<Pair>());

    for(int i=0;i<e;i++){
      int from=vec.get(i).get(0);
      int to=vec.get(i).get(1);
      int w=vec.get(i).get(2);
      adj.get(from).add(new Pair(to,w));
      adj.get(to).add(new Pair(from,w));
    }
      //list
    
    PriorityQueue<Pair> pq=new PriorityQueue<Pair>((Pair a,Pair b) -> a.s-b.s);
    pq.add(new Pair(source,0));
    //heap
    ArrayList<Integer> ans=new ArrayList<Integer>();
    for(int i=0;i<v;i++) ans.add(Integer.MAX_VALUE);
    ans.set(source,0);
    while(!pq.isEmpty()){
      Pair x=pq.poll();
      for(Pair it:adj.get(x.f)){
        if(ans.get(it.f)>=ans.get(x.f)+it.s){
          ans.set(it.f,ans.get(x.f)+it.s);
          pq.add(new Pair(it.f,ans.get(it.f)));
        }
      }

    }

    return ans;
    

    
    }
  
}

 
