package slidingwindow_twopointerr;
import java.util.*;

public class LongestSubstring {
	static int hashi(String s) {
		int[] hash=new int[256];
		for(int i=0;i<256;i++) {
			hash[i]=-1;
			
		}
		int left=0;
		int right=0;
		int maxlen=0;
		int n=s.length();
		while(right<n) {
			char currentChar=s.charAt(right);
			int currentIndex=(int)currentChar;
			
			if(hash[currentIndex]>=left) {
				left=hash[currentIndex]+1;
				
			}
			maxlen=Math.max(maxlen,right-left+1);
			hash[currentIndex]=right;
			right++;
			
			
			
		}
		return maxlen;
	}

	public static void main(String[] args) {
		String s="abcdzabcd";
		System.out.println(hashi(s));
	

	}

}
