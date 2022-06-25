class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        
        // take the job with max profitt
        Arrays.sort(arr,(a,b)-> b.profit-a.profit);
        int maxi=0;
        for(int i=0;i<n;i++) maxi=Math.max(maxi,arr[i].deadline);

        int [] slots=new int[maxi+1];

        Arrays.fill(slots,-1);
        int counts=0;
        int jobProfit=0;
        for(int i=0;i<n;i++) {
            for(int j=arr[i].deadline;j>0;j--){
                if(slots[j]!=-1) {
                    slots[j]=arr[i].id;
                    counts+=1;
                    jobProfit+=arr[i].profit;
                    break;
                }
            }
        }

        int ans[] = new int[2];
      ans[0] = counts;
      ans[1] = jobProfit;
        return ans;

    }
}