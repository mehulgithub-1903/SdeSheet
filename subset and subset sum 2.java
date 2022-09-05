
void ss(int i,int [] arr,int sum){
    if(i==arr.length){
        ans.add(sum);
    }

    // take 

    ss(i+1,arr,sum+arr[i])
    
    // not take 
    ss(i+1,arr,sum);
}
void ss(int i,int []arr,ArrayList<Integer> ds){

    if(i==n){
        ans.add(new ArrayList<>(ds));
    }

    // take 

    ds.add(arr[i]);
    ss(i+1,arr,ds);
    // not take 
    ds.remove(ds.size()-1);
    // if you dont want to take a element iterate till you surpass that element in the array
    // ek baar decide karna liya ki nahi lena hai to uske sare occurences to skip karte jao
  
    while(arr[i]==arr[i+1] && i<arr.length) i++;
    ss(i+1,arr,ds);

}
