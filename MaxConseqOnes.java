package slidingwindow_twopointerr;

public class MaxConseqOnes {
	static int conseq(int[] nums,int k) {
		int l=0;
		int r=0;
		int zeros=0;
		int len=0;
		int maxlen=0;
		for(r=0;r<nums.length;r++) {
			if(nums[r]==0) {
				zeros++;
			}
			
		
		//if the no of zeros > k then shrink the window form the left
			while(zeros>k) {
				if(nums[l]==0) {
					zeros--;
				}
				l++;		
			}
			//update the maxlength if its in valid window
			if(zeros<=k) {
				len=r-l+1;
				maxlen=Math.max(maxlen, len);
			}
		}
			return maxlen;
			
		
	}
		

	public static void main(String[] args) {
		int[] nums= {1,1,1,1,0,0,0,1,1,1,1,1};
		System.out.println(conseq(nums,2));

	}

}
