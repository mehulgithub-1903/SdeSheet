
class Solution 
{
    static class Trip{
        int start;
        int end;
        int index;

        public Trip(int start, int end, int index){
            this.start = start;
            this.end = end;
            this.index = index;
        }
    }
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        PriorityQueue<Trip> pq=new PriorityQueue<Trip>((Trip a,Trip b) ->(a.end==b.end)?a.index-b.index:a.end-b.end);
        for(int i=0; i<n; i++){
            pq.add(new Trip(start[i], end[i], i));
        }
        int ans=0;
        
        int limit=pq.poll().end;
        
        ans+=1;
        

        while(!pq.isEmpty()){
            
            Trip tp=pq.poll();

                if(tp.start>limit){
                    ans++;
                    limit=tp.end;
                                       
                }

        }
        return ans;
    }
}
