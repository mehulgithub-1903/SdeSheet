class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<Integer>();
        for(int x:nums)st.add(x);
        int n=nums.length;
        int currentStreak=0;
        int currentElement=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i]-1)) continue;
            currentElement=nums[i];
            currentStreak=1;
            while(st.contains(currentElement+1)){
                currentElement++;
                currentStreak++;
            }
            maxi=Math.max(maxi,currentStreak);
        }
        return maxi;
    }
}
