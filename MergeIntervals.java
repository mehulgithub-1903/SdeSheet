import java.util.ArrayList;

class Solution {
  public int[][] merge(int[][] intervals) {
      ArrayList<int[]> result=new ArrayList<int[]>();
      Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      //sort
      int n=intervals.length;
      for(int i =0;i<n;i++){
        if(result.isEmpty()|| result.get(result.size()-1)[1]<intervals[i][0]){
         result.add(new int[]{intervals[i][0],intervals[i][1]});
        
        }else{
          result.set(result.size()-1,new int[]{result.get(result.size()-1)[0],Math.max(intervals[i][1], result.get(result.size()-1)[1])});
        }
        // for(int e[]:result) System.out.print(e[0]+" "+e[1]);
        // System.out.println();
      }
      int ans[][]=new int[result.size()][2];
      int id=0;
      for(int e[]:result){
        ans[id]=e;
        id++;
      }
      return ans;
  }
}
