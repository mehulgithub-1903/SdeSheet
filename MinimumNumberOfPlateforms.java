class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int maxTrains=0;
        int platforms=0;

        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                maxTrains++;
                i++;

            }
            else{
                maxTrains--;
                j++;
            }
            platforms=Math.max(platforms,maxTrains);
        }
        return platforms;
    }
    
}