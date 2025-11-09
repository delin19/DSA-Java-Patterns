package slidingwindow_twopointerr;

public class SubStringCOntainingAllThreeCharac {
	static int charac(String s,int k) {
		int count=0;
		int[] lastseen= {-1,-1,-1};
		int n=s.length();
		for(int i=0;i<n;i++) {
			// Update the last seen index for current character <----(^-^)
			lastseen[s.charAt(i)-'a']=i;
		
		// Find the minimum of all three last seen indices
		int minIndex=Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
		
		//to count the rest of the elements like if the minIndex=2 ==> 2+1=3
		
		if(minIndex!=-1) {
			count+=minIndex+1;
			
		}
		}
	return count;
}
	public static void main(String[] args) {
		String s= "bbacba";
		System.out.println(charac(s,3));
	}

}
