package slidingwindow_twopointerr;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
	static int longg(String s,int k) {
		Map<Character,Integer> map=new HashMap<>();
		int l=0;
		int r=0;
		int maxlen=0;
		while(r<s.length()) {
			char currentPointer=s.charAt(r);
			map.put(currentPointer ,map.getOrDefault(currentPointer,0)+1);
			
		
			while(map.size()>k) {
				char leftpoint=s.charAt(l);
				map.put(leftpoint, map.get(leftpoint)-1);
				
			if(map.get(leftpoint)==0) {
				map.remove(leftpoint);
			}
			l++;
			
		}
		//update the length
			if(map.size()<=k) {
				int len=0;
				
				maxlen=Math.max(maxlen, r-l+1);
				r++;
				}
			}
		
	
		
		return maxlen;
	}
	public static void main(String[] args) {
		String s="aaabbccd";
		System.out.println(longg(s,2));
	}

}

