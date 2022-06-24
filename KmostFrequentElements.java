class Solution {
    class Pair{
        int num;
        int f;
        
        public Pair(int num, int f) {
            this.num = num;
            this.f = f;
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int x:nums){
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);

            }else{
                mp.put(x,1);
            }
        }
        PriorityQueue<Pair> q = new PriorityQueue<>((Pair a,Pair b)->a.f-b.f);
        for(int x:mp.keySet()){
            q.add(new Pair(x,mp.get(x)));
            if(q.size()>k) q.poll();
        }
        int ans[]=new int[k];
        int i=0; 
        while(!q.isEmpty()) {
            ans[i]=pq.poll().num;
            i++;
        }

        return ans;

    }
}