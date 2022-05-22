import java.util.*;

public class Solution {
    static Map<String,Boolean> mp;
    public static Boolean wordBreak(String[] arr, int n, String target) {
        
        mp=new HashMap<String,Boolean>();
        Set<String> st=new HashSet<String>();
		for(String e:arr) st.add(e);
		
        return rec(st,target);
    }
    public static Boolean rec(Set<String> arr,String target){
        if(arr.contains(target)) return true;
        if(mp.containsKey(target)) return mp.get(target);
        boolean ans=false;
        for(int k=1;k<target.length();k++){
            ans=rec(arr,target.substring(0,k)) && rec(arr,target.substring(k,target.length()));
            if(ans) break;
        }

        mp.put(target,ans);
        return ans;
    }
}
