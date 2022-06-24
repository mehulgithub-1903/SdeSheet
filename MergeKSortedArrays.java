import java.util.*;

public class Solution 
{
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<k; i++){
            for(int x:kArrays.get(i)) pq.add(x);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(  !pq.isEmpty()) result.add(pq.poll());
        return result;
    }
}
