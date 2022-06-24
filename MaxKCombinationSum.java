public class Solution {
    public int[] solve(int[] a, int[] b, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int n=a.length;
        int[] result = new int[k];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(a[i]+b[j]);
                
            }
        }
            while(pq.size()!=k) pq.poll();
            int i=k-1;
            while(!pq.isEmpty()){
                result[i]=pq.poll();
                i--;
            }
        
            
            
            
        

        return result;

    }
}
