class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        solve(s,new ArrayList<String>(),result);
        return result;
    }
    public void solve(String s,ArrayList<String> ds,List<List<String>> result){


		if(s=="") {
			result.add(new ArrayList<>(ds));
		}
		for(int i=1;i<=s.length();i++){

			if(isPalim(s.substring(0,i))){
				ds.add(s.substring(0,i));
				solve(s.substring(i,s.length()), ds, result);
				ds.remove(ds.size()-1);
			}
		}
		
	}
    public boolean isPalim(String s){
		int i=0;
		int j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
}
