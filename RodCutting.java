class Solution {
    static Map<String,Integer> mp;

    public int minCost(int n, int[] cuts) {
        
        mp=new HashMap<String,Integer>();
        return rec(0,n,cuts);
    }
    public int rec(int s,int e,int[] cuts){
        String key=s+" "+e;
        if(mp.containsKey(key)) return mp.get(key);

        int ans=Integer.MAX_VALUE;
        for(int x:cuts){
                int temp=0;
                if(s>=x || e<=x) continue;
            temp+=rec(s,x,cuts);
            temp+=rec(x,e,cuts);
            ans=Math.min(temp+e-s,ans);
        }
        if(ans==Integer.MAX_VALUE){
            ans=0;
        }
        mp.put(key,ans);
       return ans;

    }
}
